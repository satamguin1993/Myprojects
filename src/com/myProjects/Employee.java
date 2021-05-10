package com.myProjects;

import java.util.Comparator;

public class Employee implements Comparator {

    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compare(Object o1, Object o2) {
        int c = ((Employee)o1).getAge() - ((Employee)o2).getAge();
        if (c==0) {
            c = ((Employee)o1).getName().compareTo(((Employee)o2).getName());
        }
        return c;
    }
}
