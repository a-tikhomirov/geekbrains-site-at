package ru.atikhomirov.example.exceptions.new_ex_example;

import ru.atikhomirov.geekbrains.site.at.common.Page;

public class Navigation {

    //123
    public Page clickButton(String nameButton) throws NotFoundPageException {
        switch (nameButton){
            case "Курсы":{
                return (Page) this;
            } default:{
                throw new NotFoundPageException("Страницы: "+nameButton+" не существует!");
            }
        }
    }
}
