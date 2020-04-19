package ru.atikhomirov.geekbrains.site.at.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.atikhomirov.geekbrains.site.at.common.PageObject;

public class AuthPage extends PageObject {

    @FindBy(css = "[id=\"user_email\"]")
    private WebElement inputEmail;

    @FindBy(css = "[id=\"user_password\"]")
    private WebElement inputPassword;

    @FindBy(css = "[data-testid=\"login-submit\"]")
    private WebElement buttonLogin;

    public AuthPage(WebDriver driver) {
        super(driver);
    }

    @Step("Авторизоваться с данными {email} / {passwd}")
    public MainPage login(String email, String passwd) {
        waitVisible(inputEmail).sendKeys(email);
        waitVisible(inputPassword).sendKeys(passwd);
        waitClickable(buttonLogin).click();
        return PageFactory.initElements(driver, MainPage.class);
    }
}
