package com.saurabhjava;
class Base{
    Base(int val){
        System.out.println("You provided " + val);
    }
}
class Derived extends Base{
    Derived(){
        super(10);
        System.out.println("Constructor of Derived");
    }
}
public class Program5 {
    //Super Keyword
    // It is used to call the constructor of base class
    public static void main(String[] args){
        new Derived();
    }
}
