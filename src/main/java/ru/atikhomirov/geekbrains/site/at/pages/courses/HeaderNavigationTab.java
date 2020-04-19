package ru.atikhomirov.geekbrains.site.at.pages.courses;

import io.qameta.allure.Step;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.atikhomirov.geekbrains.site.at.common.PageObject;

public class HeaderNavigationTab extends PageObject {
    private CoursesPage ownerPage;

    @FindBy(css = "[class*=\"nav nav-tabs\"] [href=\"#prof-compact\"]")
    private WebElement buttonNavProfessions;

    @FindBy(css = "[class*=\"nav nav-tabs\"] [href=\"#free\"]")
    private WebElement buttonFreeIntensives;

    @FindBy(css = "[class*=\"nav nav-tabs\"] [href=\"#cour-new\"]")
    private WebElement buttonNavCourses;

    @FindBy(css = "[class*=\"nav nav-tabs\"] [href*=\"forbusiness\"]")
    private WebElement buttonForBusiness;

    public HeaderNavigationTab(WebDriver driver, CoursesPage ownerPage) {
        super(driver);
        this.ownerPage = ownerPage;
        PageFactory.initElements(driver, this);
    }

    @Step("Нажать на кнопку \"{0}\" в секции headerNavigationTab")
    public CoursesPage clickButton(String name){
        WebElement button;
        switch (name){
            case "Профессии": {
                button = buttonNavProfessions;
                break;
            }
            case "Бесплатные интенсивы": {
                button = buttonFreeIntensives;
                break;
            }
            case "Курсы": {
                button = buttonNavCourses;
                break;
            }
            default: {
                throw new NotFoundException("Элемента " + name + " нет в классе " + getClass().getName());
            }
        }
        waitClickable(button).click();
        return ownerPage;
    }
}
