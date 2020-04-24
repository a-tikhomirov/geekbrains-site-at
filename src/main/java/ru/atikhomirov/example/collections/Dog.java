package ru.atikhomirov.example.collections;

import java.util.Objects;

public class Dog implements Comparable< Dog >{
    private String name;
    private int age;
    private int weight;
    private boolean gender;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Dog dog = (Dog) o;
        return name == dog.name &&
                age == dog.age &&
                weight == dog.weight &&
                gender == dog.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, gender);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", gender=" + gender +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        return this.name.compareTo(o.name);
    }
}
