package ru.atikhomirov.geekbrains.site.at.sections;

import io.qameta.allure.Step;
import org.hamcrest.Matcher;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.atikhomirov.geekbrains.site.at.common.*;

import static org.hamcrest.MatcherAssert.assertThat;

public class Search extends PageObject {
    private Page ownerPage;

    @FindBy(css = "input[class=\"search-panel__search-field\"]")
    private WebElement inputSearch;

    @FindBy(css = "class=\"search-panel__search-reset\"")
    private WebElement buttonCloseSearch;

    @FindBy(css = "[class=\"search-page-tabs\"] [data-tab=\"professions\"] span")
    private WebElement labelProfessionsCount;

    @FindBy(css = "[class=\"search-page-tabs\"] [data-tab=\"courses\"] span")
    private WebElement labelCoursesCount;

    @FindBy(css = "[class=\"search-page-tabs\"] [data-tab=\"webinars\"] span")
    private WebElement labelWebinarsCount;

    @FindBy(css = "[class=\"search-page-tabs\"] [data-tab=\"blogs\"] span")
    private WebElement labelBlogsCount;

    @FindBy(css = "[class=\"search-page-tabs\"] [data-tab=\"forums\"] span")
    private WebElement labelForumsCount;

    @FindBy(css = "[class=\"search-page-tabs\"] [data-tab=\"tests\"] span")
    private WebElement labelTestsCount;

    @FindBy(css = "[class*=\"search-page-block\"] [class=\"company-item__pic\"] [alt*=\"GeekBrains\"]")
    private WebElement buttonCompaniesGeekbrains;

    public Search(WebDriver driver, Page ownerPage) {
        super(driver);
        this.ownerPage = ownerPage;
        PageFactory.initElements(driver, this);
    }

    @Step("Ввести поисковый запрос {0}")
    public Search enterSearchText(String text) {
        waitVisible(inputSearch).sendKeys(text);
        return this;
    }

    @Step("Закрыть поиск")
    public Page clickCloseSearch() {
        waitClickable(buttonCloseSearch).click();
        return ownerPage;
    }

    @Step("Проверка элемента {0} на соответствие условию {1}")
    public Search checkElement(String name, Matcher matcher) {
        Object actual = null;
        switch (name){
            case "Профессии": {
                actual = getElementInt(labelProfessionsCount);
                break;
            }
            case "Курсы": {
                actual = getElementInt(labelCoursesCount);
                break;
            }
            case "Вебинары": {
                actual = getElementInt(labelWebinarsCount);
                break;
            }
            case "Блоги": {
                actual = getElementInt(labelBlogsCount);
                break;
            }
            case "Форумы": {
                actual = getElementInt(labelForumsCount);
                break;
            }
            case "Тесты": {
                actual = getElementInt(labelTestsCount);
                break;
            }
            case "Geekbrains": {
                actual = waitVisible(buttonCompaniesGeekbrains).isDisplayed();
                break;
            }
            default: {
                throw new NotFoundException("Элемента " + name + " нет в классе " + getClass().getName());
            }
        }
        assertThat(actual, matcher);
        return this;
    }
}
