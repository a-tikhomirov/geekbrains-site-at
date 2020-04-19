package ru.atikhomirov.geekbrains.site.at.common;

import ru.atikhomirov.geekbrains.site.at.sections.*;

public interface Page {
    Header getHeader();
    Footer getFooter();
    Sidebar getSidebar();
}
