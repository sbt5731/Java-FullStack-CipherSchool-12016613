package com.saurabhjava;

public class Day9P2 {
    void add(int n1, int n2) {
        System.out.println(n1+n2);
    }
    void add(int n1, int n2, int n3){
        System.out.println(n1+n2+n3);
    }
    void add(float n1, float n2){
        System.out.println(n1+n2);
    }
    void add(int n1, float f1){
        System.out.println(n1+f1);
    }
    void add(float f1, int n1){
        System.out.println(f1+n1);
    }
    public static void main(String[] args){
        Day9P2 p2 = new Day9P2();
        p2.add(10,12);
    }
}
