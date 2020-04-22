package ru.atikhomirov.geekbrains.site.at.pages;

import org.openqa.selenium.WebDriver;
import ru.atikhomirov.geekbrains.site.at.common.*;
import ru.atikhomirov.geekbrains.site.at.sections.*;

public class CareerPage extends PageObject implements Page {
    private Header header;
    private Footer footer;
    private Sidebar sidebar;
    private Search search;

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

    public CareerPage(WebDriver driver) {
        super(driver);
        header = new Header(driver, this);
        footer = new Footer(driver, this);
        sidebar = new Sidebar(driver);
        search = new Search(driver, this);
    }
}
