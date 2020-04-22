package ru.atikhomirov.geekbrains.site.at;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.support.PageFactory;
import ru.atikhomirov.geekbrains.site.at.common.BaseTest;
import ru.atikhomirov.geekbrains.site.at.pages.AuthPage;

@Feature(value = "Проверка страниц")
@Story(value = "Проверка авторизации")
@DisplayName("Проверка авторизации на странице https://geekbrains.ru/login")
@Execution(ExecutionMode.CONCURRENT)
public class AuthTest extends BaseTest {

    @Step("Открыть страницу https://geekbrains.ru/login")
    @BeforeEach
    public void SetUp(){
        super.setUpDriver();
        driver.get("https://geekbrains.ru/login");
    }

    @Description("Проверка авторизации на странице https://geekbrains.ru/login")
    @DisplayName("Проверка отображения страницы \"Главная\"")
    @Test
    void checkMain(){
        PageFactory.initElements(driver, AuthPage.class)
                .login("hao17583@bcaoo.com", "hao17583")
                .getHeader().checkTitle("Главная");
    }

    @AfterEach
    public void tearDown(){
        super.tearDown();
    }
}
