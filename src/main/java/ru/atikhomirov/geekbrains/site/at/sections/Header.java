package ru.atikhomirov.geekbrains.site.at.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.atikhomirov.geekbrains.site.at.common.Page;
import ru.atikhomirov.geekbrains.site.at.common.PageObject;

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
    }

    public Page checkSection() {
        checkElementsDisplayed(new WebElement[] {
                section,
                buttonSearch
        });
        return ownerPage;
    }

    public Page checkTitle(String expectedTitle){
        checkText(labelHeader, expectedTitle);
        return ownerPage;
    }

    public Search clickSearch(){
        waitClickable(buttonSearch).click();
        return PageFactory.initElements(driver, Search.class);
    }
}
