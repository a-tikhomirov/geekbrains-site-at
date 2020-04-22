package ru.atikhomirov.geekbrains.site.at.pages.courses;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.atikhomirov.geekbrains.site.at.common.*;
import ru.atikhomirov.geekbrains.site.at.sections.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class CoursesPage extends PageObject implements Page {
    private Header header;
    private Footer footer;
    private Sidebar sidebar;
    private Search search;

    private HeaderNavigationTab headerNavigationTab;
    private FiltersForm filtersForm;

    @Override
    public Header getHeader() {
        return header;
    }

    @Override
    public Footer getFooter() {
        return footer;
    }

    @Override
    public Sidebar getSidebar() {
        return sidebar;
    }

    @Override
    public Search getSearch() { return search; }

    public HeaderNavigationTab getHeaderNavigationTab() { return headerNavigationTab; }
    public FiltersForm getFiltersForm() { return filtersForm; }

    @FindBy(css = "div[id=\"cour-new\"]")
    private WebElement divCourses;

    public CoursesPage(WebDriver driver) {
        super(driver);
        header = new Header(driver, this);
        footer = new Footer(driver, this);
        sidebar = new Sidebar(driver);
        search = new Search(driver, this);
        headerNavigationTab = new HeaderNavigationTab(driver, this);
        filtersForm = new FiltersForm(driver, this);
    }

    @Step("Проверить наличие текста \"{course}\" в списке курсов")
    private void checkCourse(String course) {
        boolean displayed = true;
        String xpath = String.format("//span[@class=\"gb-course-card__title-text\"][contains(.,\"%s\")]", course);
        boolean actual;
        try {
            actual = divCourses.findElement(By.xpath(xpath)).isDisplayed();
        } catch (NoSuchElementException e) {
            actual = false;
            e.printStackTrace();
        }
        assertThat(actual,is(equalTo(displayed)));
    }

    //@Step("Проверить наличие текста \"{courses}\" в списке курсов")
    public CoursesPage checkCourses(String ...courses){
        for (String course : courses) {
            checkCourse(course);
        }
        return this;
    }
}
