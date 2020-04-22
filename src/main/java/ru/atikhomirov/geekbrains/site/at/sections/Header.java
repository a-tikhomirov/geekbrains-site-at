package ru.atikhomirov.geekbrains.site.at.sections;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.atikhomirov.geekbrains.site.at.common.*;

public class Header extends PageObject {
    private Page ownerPage;

    @FindBy(css = "[id=\"top-menu\"]")
    protected WebElement section;

    @FindBy(css = "[class=\"gb-header__title\"]")
    protected WebElement labelHeader;

    @FindBy(css = "[class*=\"gb-header\"] a[class=\"show-search-form\"]")
    protected WebElement buttonSearch;

    public Header(WebDriver driver, Page ownerPage) {
        super(driver);
        this.ownerPage = ownerPage;
        PageFactory.initElements(driver, this);
    }

    @Step("Проверить элементы страницы в секции header")
    public Page checkSection() {
        checkElementsDisplayed(new WebElement[] {
                section,
                buttonSearch
        });
        return ownerPage;
    }

    @Step("Проверить текст заголовка страницы")
    public Page checkTitle(String expectedTitle) {
        checkText(labelHeader, expectedTitle);
        return ownerPage;
    }

    @Step("Нажать кнопку поиска в секции header")
    public Search clickSearch() {
        waitClickable(buttonSearch).click();
        return ownerPage.getSearch();
    }
}
