package ru.atikhomirov.example.collections.arraylist;

import ru.atikhomirov.example.collections.Dog;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Белка"));
        dogs.add(new Dog("Стрелка"));
        dogs.add(new Dog("Барбос"));

        ListIterator<Dog> dogListIterator = dogs.listIterator();
        while (dogListIterator.hasNext()) {
            System.out.println(dogListIterator.next());
        }
        System.out.println();
        while (dogListIterator.hasPrevious()) {
            System.out.println(dogListIterator.previous());
        }
    }
}
