package ru.atikhomirov.example.collections.arraylist;

import ru.atikhomirov.example.collections.Dog;

import java.util.ArrayList;

public class CapacityExample {
    public static void main(String[] args) throws Exception {
        ArrayList<Dog> dogs = new ArrayList<>(2);
        dogs.add(new Dog("Белка"));
        dogs.add(new Dog("Стрелка"));
        dogs.ensureCapacity(8);
        // Consider a scenario when there is a need to add huge number of elements to an already full ArrayList,
        // in such case ArrayList has to be resized several number of times which would result in a poor performance.
        // For such scenarios ensureCapacity() method of Java.util.ArrayList class is very useful as it increases
        // the size of the ArrayList by a specified capacity.
    }
}
