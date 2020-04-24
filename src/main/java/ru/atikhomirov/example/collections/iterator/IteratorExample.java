package ru.atikhomirov.example.collections.iterator;

import ru.atikhomirov.example.collections.Dog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        Collection<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Трус"));
        dogs.add(new Dog("Балбес"));
        dogs.add(new Dog("Бывалый"));

        Iterator<Dog> iterator = dogs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        iterator = dogs.iterator();
        iterator.next();
        iterator.remove();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
