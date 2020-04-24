package ru.atikhomirov.example.collections.arraylist;

import ru.atikhomirov.example.collections.Dog;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
    public static void main(String[] args) throws Exception {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Трус"));
        dogs.add(new Dog("Балбес"));
        dogs.add(new Dog("Бывалый"));

        //сортировка
        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println(dogs);
        System.out.println();

        //двунаправленный итератор
        ListIterator<Dog> dogListIterator = dogs.listIterator();
        while (dogListIterator.hasNext()) {
            System.out.println(dogListIterator.next());
        }
        System.out.println();
        while (dogListIterator.hasPrevious()) {
            System.out.println(dogListIterator.previous());
        }
    }

    private static int getArrayListCapacity(ArrayList<Dog> list) throws Exception{

        //get the elementData field from ArrayList class
        Field arrayField = ArrayList.class.getDeclaredField("elementData");

        /*
         * Since the elementData field is private, we need
         * to make it accessible first
         */
        arrayField.setAccessible(true);

        //now get the elementData Object array from our list
        Object[] internalArray = (Object[])arrayField.get(list);

        //Internal array length is the ArrayList capacity!
        return internalArray.length;
    }
}


