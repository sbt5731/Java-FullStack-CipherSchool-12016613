package com.saurabhjava;

import java.util.PriorityQueue;

public class priority {
    public static void main(String[] args){
        PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Red");
        colors.add("BLue");
        colors.add("Yellow");
        colors.add("Pink");

        System.out.println(colors.peek());
        System.out.println(colors.poll());//printing the top element and removing it as well
        System.out.println(colors.peek());
        System.out.println(colors);
    }
}
