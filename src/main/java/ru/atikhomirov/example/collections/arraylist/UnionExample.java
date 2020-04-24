package ru.atikhomirov.example.collections.arraylist;

import org.apache.commons.collections4.ListUtils;
import ru.atikhomirov.example.collections.Dog;

import java.util.ArrayList;
import java.util.List;

public class UnionExample {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Трус"));
        dogs.add(new Dog("Балбес"));
        dogs.add(new Dog("Бывалый"));

        ArrayList<Dog> dogs2 = new ArrayList<>();
        dogs.add(new Dog("Белка"));
        dogs.add(new Dog("Стрелка"));

        List<Dog> dogs3 = ListUtils.union(dogs, dogs2);
        System.out.println(dogs3);
//        <dependency>
//            <groupId>org.apache.commons</groupId>
//            <artifactId>commons-collections4</artifactId>
//            <version>4.4</version>
//        </dependency>
    }
}
