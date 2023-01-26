package com.saurabhjava;

class Dog{
    String breed = "Tibetian Mastiff";
    int age = 3;
    boolean isVegetarian = false;

    void bark(){
        System.out.println("Woof Woof");
    }
    boolean fly() {
        return false;
    }
    void eat(String food){
        System.out.println("Yum Yum "+ food + " is delicious");
    }
}

public class oops1 {
    public static void main(String[] args) {
        Dog terry = new Dog();
        System.out.println("Hi, I am Terry!! My breed is " + terry.breed);
        System.out.println("Hi, I am " + terry.age+" Years old");
        System.out.println("Am I vegetarian " + (terry.isVegetarian?"Yes":"No"));
        terry.bark();
        terry.eat("Pedigree");
        System.out.println("Can I try to fly" + (terry.fly()?"Yes":"No"));

    }
}
