package ru.atikhomirov.example.collections.map;

import ru.atikhomirov.example.collections.Dog;
import ru.atikhomirov.example.collections.Human;

import java.util.HashMap;

public class GetExample {
    public static void main(String[] args) {
        HashMap<Human, Dog> mapDogs = new HashMap<>();

        mapDogs.put(new Human("Иван"), new Dog("Белка"));
        mapDogs.put(new Human("Петр"), new Dog("Стрелка"));

        System.out.println(mapDogs.get(new Human("Петр")));
        System.out.println(mapDogs.keySet());
        System.out.println(mapDogs.values());

//        Удаление элементов
//        boolean remove(Object key); - одного одного элемента по ключу
//        void clear(); - удаление всех элементов
//        Сравнение
//        boolean equals(Object o); - элементы коллекции эквиваленты
    }
}
