package com.springdingdong.jeongtaek.assignment1;

public class DeveloperPython implements Developer{
    private long salary = 0;

    public DeveloperPython(long salary) {
        this.salary = salary;
    }

    @Override
    public void develop() {
        System.out.println("Python으로 개발하기");
    }

    @Override
    public void rest() {
        System.out.println("침대에 누워서 쉬기");
    }

    @Override
    public long getSalary() {
        return salary;
    }

    @Override
    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public void quit() {
        Developer.super.quit();
    }
}
