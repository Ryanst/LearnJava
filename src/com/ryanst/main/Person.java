package com.ryanst.main;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhengjuntong on 16/6/23.
 */

public class Person {

    private int    id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Person person) {
        return person.id == id;
    }

    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {

        Set<Person> set = new HashSet<Person>();
        for (int i = 0; i < 10; i++) {
            set.add(new Person(i, "Jim"));
        }
        System.out.println(set.size());
    }
}
