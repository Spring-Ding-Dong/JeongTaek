package com.springdingdong.jeongtaek.assignment1;

public class DeveloperJava implements Developer {
    private long salary = 0;

    public DeveloperJava(long salary) {
        this.salary = salary;
    }

    @Override
    public void develop() {
        System.out.println("Java로 개발하기");
    }

    @Override
    public void rest() {
        System.out.println("놀면서 쉬기");
    }

    @Override
    public long getSalary() {
        return salary;
    }

    @Override
    public void setSalary(long salary) {
        this.salary = salary;
    }
}
