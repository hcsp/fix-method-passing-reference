package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    public static Cat cat;

    public static void main(String[] args) {
        newCat();
        System.out.println(cat);
    }

    public static void newCat() {
        cat = new Cat("Tom");
    }
}
