package ru.atikhomirov.geekbrains.site.at.pages.courses;

import io.qameta.allure.Step;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.atikhomirov.geekbrains.site.at.common.PageObject;

public class FiltersForm extends PageObject {
    private CoursesPage coursesPage;

    @FindBy(css = "input[id=\"filter-0\"]")
    private WebElement checkBoxFilterFree;

    @FindBy(css = "input[id=\"filter-9\"]")
    private WebElement checkBoxFilterQA;

    public FiltersForm(WebDriver driver, CoursesPage coursesPage) {
        super(driver);
        this.coursesPage = coursesPage;
        PageFactory.initElements(driver, this);
    }

    private WebElement getFilter(String name) {
        WebElement checkBox;
        switch (name){
            case "Бесплатные": {
                checkBox = checkBoxFilterFree;
                break;
            }
            case "Тестирование": {
                checkBox = checkBoxFilterQA;
                break;
            }
            default: {
                throw new NotFoundException("Элемента " + name + " нет в классе " + getClass().getName());
            }
        }
        return checkBox;
    }

    @Step("Установить в {state} фильтр {filter}")
    private void setFilter(boolean state, String filter){
        WebElement checkbox = getFilter(filter);
        if (checkbox.isSelected() != state) clickCheckbox(checkbox);
    }

    //@Step("Установить в {state} фильтры {filters}")
    public CoursesPage setFilters(boolean state, String ...filters){
        for (String filter : filters) {
            setFilter(state, filter);
        }
        return coursesPage;
    }
}
