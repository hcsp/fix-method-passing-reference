package com.github.hcsp.pet;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    public  Cat(){}
    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
