package com.saurabhjava;
interface test{
    void square(int a);
}
class Arithmetic implements test{

    @Override
    public void square(int a) {
        System.out.println("You called Square");
        System.out.println("Square of a is " + a*a);
    }

    void arithmetic(){
        System.out.println("Inside of class Arithmetic");
    }
}
public class Day9P12 {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.arithmetic();
        arithmetic.square(10);

    }
}

