package com.saurabhjava;
interface A{
    void meth1();
    void meth2();
}
class MyClass implements A{

    @Override
    public void meth1() {
        System.out.println("Method1");
    }

    @Override
    public void meth2() {
        System.out.println("Method2");
    }
}
public class Day9P11 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.meth1();
        myClass.meth2();
    }

}
