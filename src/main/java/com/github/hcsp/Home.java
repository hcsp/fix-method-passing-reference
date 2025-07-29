package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    public static Cat cat;

    public static void main(String[] args) {
        String cat = newCat();
        System.out.println(cat);
    }

    public static String newCat() {
        cat = new Cat("Tom");
        return String.valueOf(cat);
    }
}
