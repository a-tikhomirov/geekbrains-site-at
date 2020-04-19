package ru.atikhomirov.geekbrains.site.at.pages.career;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.atikhomirov.geekbrains.site.at.common.Page;
import ru.atikhomirov.geekbrains.site.at.common.PageObject;
import ru.atikhomirov.geekbrains.site.at.sections.Footer;
import ru.atikhomirov.geekbrains.site.at.sections.Header;
import ru.atikhomirov.geekbrains.site.at.sections.Sidebar;

public class CareerPage extends PageObject implements Page {
    private Header header;
    private Footer footer;
    private Sidebar sidebar;

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

    public CareerPage(WebDriver driver) {
        super(driver);
        header = new Header(driver, this);
        PageFactory.initElements(driver, header);
        footer = new Footer(driver, this);
        PageFactory.initElements(driver, footer);
        sidebar = PageFactory.initElements(driver, Sidebar.class);
    }
}
