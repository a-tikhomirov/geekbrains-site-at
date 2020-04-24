package ru.atikhomirov.example.collections.arraylist;

import ru.atikhomirov.example.collections.Dog;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class TrimExample {
    public static void main(String[] args) throws Exception {
        ArrayList<Dog> dogs = new ArrayList<Dog>(5);
        dogs.add(new Dog("Белка"));
        dogs.add(new Dog("Стрелка"));

        System.out.println(getArrayListCapacity(dogs));

        dogs.trimToSize();

        System.out.println(getArrayListCapacity(dogs));
    }

    private static int getArrayListCapacity(ArrayList<Dog> list) throws Exception {

        //get the elementData field from ArrayList class
        Field arrayField = ArrayList.class.getDeclaredField("elementData");

        /*
         * Since the elementData field is private, we need
         * to make it accessible first
         */
        arrayField.setAccessible(true);

        //now get the elementData Object array from our list
        Object[] internalArray = (Object[]) arrayField.get(list);

        //Internal array length is the ArrayList capacity!
        return internalArray.length;
    }
}
