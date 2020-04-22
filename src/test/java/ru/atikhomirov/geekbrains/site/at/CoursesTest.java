package ru.atikhomirov.geekbrains.site.at;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.support.PageFactory;
import ru.atikhomirov.geekbrains.site.at.common.BaseTest;
import ru.atikhomirov.geekbrains.site.at.pages.AuthPage;
import ru.atikhomirov.geekbrains.site.at.pages.courses.CoursesPage;

@Feature(value = "Проверка страниц")
@Story(value = "Проверка страницы Курсы")
@DisplayName("Проверка результатов фильтрации на странице https://geekbrains.ru/courses")
@Execution(ExecutionMode.CONCURRENT)
public class CoursesTest extends BaseTest {

    @Step("Открыть страницу https://geekbrains.ru/login")
    @BeforeEach
    protected void SetUp(){
        super.setUpDriver();
        driver.get("https://geekbrains.ru/login");
    }

    @Description("Проверка результатов фильтрации на странице https://geekbrains.ru/courses")
    @DisplayName("Проверка результатов фильтрации")
    @Test()
    void checkCourses(){
        ((CoursesPage)
                PageFactory.initElements(driver, AuthPage.class)
                .login("hao17583@bcaoo.com", "hao17583")
                .getSidebar().clickButton("Курсы")
                .getHeader().checkTitle("Курсы")
        )
                .getHeaderNavigationTab().clickButton("Курсы")
                .getFiltersForm().setFilters(true, "Бесплатные", "Тестирование")
                .checkCourse("Тестирование ПО. Уровень 1", "Тестирование ПО. Уровень 2");
    }

    @AfterEach
    protected void tearDown(){
        super.tearDown();
    }
}
