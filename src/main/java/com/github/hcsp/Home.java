package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {                                 //Home类
    public static Cat cat;                          //Home的静态成员变量cat

    public static void main(String[] args) {         //程序入口

        newCat();                                   //newCat函数调用
        System.out.println(cat);                    //输出cat函数调用的结果
    }

    public static void newCat() {                  //newCat函数定义 参数Cat cat
        cat =new Cat("Tom");
    }
}


// We want to create a new Cat, but it doesn't seem to be working
// Think why and fix the code to make the program output "Cat(Tom)"
// 我们想要在这里创建一只新的Cat，但是似乎没有生效
// 思考一下为什么并修复这个问题，使得程序输出"Cat(Tom)"