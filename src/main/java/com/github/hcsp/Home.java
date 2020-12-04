package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    public static Cat cat;
    public static void main(String[] args) {
        Cat newCat = new Cat("Tom");
//        cat = new Cat("Tom");
        System.out.println(cat);
    }
}
