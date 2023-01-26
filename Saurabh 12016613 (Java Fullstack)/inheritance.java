package com.saurabhjava;

class Father{
    Father(){
        System.out.println("Constructor of base");
    }
    void foodHabit(){
        System.out.println("I like salty");
    }
}
class Son extends Father{
    Son(){
        System.out.println("Constructor of Derived");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Son peter  = new Son();

        peter.foodHabit();
    }
}
