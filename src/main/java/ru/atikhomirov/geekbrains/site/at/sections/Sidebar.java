package ru.atikhomirov.geekbrains.site.at.sections;

import io.qameta.allure.Step;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.atikhomirov.geekbrains.site.at.common.Page;
import ru.atikhomirov.geekbrains.site.at.common.PageObject;
import ru.atikhomirov.geekbrains.site.at.pages.CareerPage;
import ru.atikhomirov.geekbrains.site.at.pages.courses.CoursesPage;

public class Sidebar<T> extends PageObject {

    @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/courses\"]")
    private WebElement buttonCourses;

    @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/events\"]")
    private WebElement buttonEvents;

    @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/topics\"]")
    private WebElement buttonTopics;

    @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/posts\"]")
    private WebElement buttonPosts;

    @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/tests\"]")
    private WebElement buttonTests;

    @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/career\"]")
    private WebElement buttonCareer;

    public Sidebar(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Нажать на кнопку \"{0}\" в секции sidebar")
    public Page clickButton(String name) {
        WebElement button = null;
        Class pageClass = CareerPage.class;
        switch (name) {
            case "Курсы": {
                button = buttonCourses;
                pageClass = CoursesPage.class;
                break;
            }
            case "Вебинары": {
                button = buttonEvents;
                break;
            }
            case "Форум": {
                button = buttonTopics;
                break;
            }
            case "Блог": {
                button = buttonPosts;
                break;
            }
            case "Тесты": {
                button = buttonTests;
                break;
            }
            case "Карьера": {
                button = buttonCareer;
                break;
            }
            default: {
                throw new NotFoundException("Элемента " + name + " нет в классе " + getClass().getName());
            }
        }
        waitClickable(button).click();
        return (Page) PageFactory.initElements(driver, pageClass);
    }
}
