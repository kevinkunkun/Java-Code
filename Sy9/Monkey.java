package Sy9;

import java.io.Serializable;

public class Monkey implements Serializable {
    private int age;
    private String name;

    public Monkey(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override public String toString() {
        return "Monkey{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}