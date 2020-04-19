package ru.atikhomirov.geekbrains.site.at;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.support.PageFactory;
import ru.atikhomirov.geekbrains.site.at.common.BaseTest;
import ru.atikhomirov.geekbrains.site.at.pages.CareerPage;

import java.util.stream.Stream;

@Feature(value = "Проверка страниц")
@Story(value = "Проверка навигации")
@DisplayName("Проверка элементов навигации sidebar страницы https://geekbrains.ru/career")
@Execution(ExecutionMode.CONCURRENT)
public class NavigationTest extends BaseTest {

    @Step("Открыть страницу https://geekbrains.ru/career")
    @BeforeEach
    protected void SetUp() {
        super.setUpDriver();
        driver.get("https://geekbrains.ru/career");
    }

    @Description("Проверка элементов навигации sidebar страницы https://geekbrains.ru/career")
    @DisplayName("Проверка элементов и заголовка Header, проверка элементов Footer")
    @ParameterizedTest(name = "{index} ==> Проверка перехода на страницу \"{0}\"...")
    @MethodSource("stringProvider")
    void checkSideBarNavigation(String navElementName) {
        PageFactory.initElements(driver, CareerPage.class)
                .getSidebar().clickButton(navElementName)
                .getHeader().checkSection()
                .getHeader().checkTitle(navElementName)
                .getFooter().checkSection()
                .getFooter().checkElementsText();
    }

    static Stream<String> stringProvider() {
        return Stream.of("Курсы", "Вебинары", "Форум", "Блог", "Тесты", "Карьера");
    }

    @AfterEach
    protected void tearDown() {
        super.tearDown();
    }
}
