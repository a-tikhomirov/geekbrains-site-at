package ru.atikhomirov.phonebook;

import java.util.Arrays;

public class PhoneBookExample {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("+7(999)111-11-11", "Иванов");
        phoneBook.add("+7(999)222-22-22", "Петров");
        phoneBook.add("+7(999)333-33-33", "Сидоров");
        phoneBook.add("+7(999)444-44-44", "Иванов");
        phoneBook.add("+7(999)555-55-55", "Иванов");

        System.out.printf("Телефонный справочник:\n%s\n", phoneBook.toString());

        String[] results = phoneBook.getPhones("Иванов");
        System.out.printf("Результаты поиска по фамилии Иванов:\n%s\n", Arrays.toString(results));
        System.out.println();

        System.out.println(phoneBook.searchPhones("Иванов"));
    }
}
