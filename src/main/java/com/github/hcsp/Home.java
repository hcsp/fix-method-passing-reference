package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    public static Cat cat;    // 成员变量


    public static void main(String[] args) {     // 程序入口
        // We want to create a new Cat, but it doesn't seem to be working
        // Think why and fix the code to make the program output "Cat(Tom)"
        newCat();
        System.out.println(cat);
    }

    public static void newCat() {
        cat = new Cat ("Tom");
    }
}
