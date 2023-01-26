package com.saurabhjava;

import java.util.HashSet;
import java.util.TreeSet;

public class HashtoTree {
    public static void main(String[] args){
        HashSet<String> set1 = new HashSet<>();
        set1.add("DSA");
        set1.add("Android Development");
        set1.add("Machine Learning");
        set1.add("Java");
        set1.add("Kotlin");
        set1.add("C++");
        set1.add("Python");
        System.out.println("Hashset: " + set1);

        //Converting

        TreeSet<String> set2 = new TreeSet<>(set1);
        System.out.println("TreeSet: " + set2);
    }
}
