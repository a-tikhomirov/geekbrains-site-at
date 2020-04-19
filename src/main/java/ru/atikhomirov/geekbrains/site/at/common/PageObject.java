package ru.atikhomirov.geekbrains.site.at.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public abstract class PageObject {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public PageObject(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    // Wait elements
    protected WebElement waitVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    protected WebElement waitClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    // Get elements values
    protected String getElementText(WebElement element) {
        return waitVisible(element).getText();
    }

    protected int getElementInt(WebElement element) { return Integer.valueOf(getElementText(element)); }

    // Check elements
    protected void checkText(WebElement element, String expectedText) {
        assertThat(getElementText(element), equalToCompressingWhiteSpace(expectedText));
    }

    protected void checkElementsDisplayed(WebElement[] elements) {
        boolean displayed = true;
        for (WebElement element : elements) {
            assertThat(element.isDisplayed(), is(equalTo(displayed)));
        }
    }
}
