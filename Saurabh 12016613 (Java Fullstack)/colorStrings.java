package com.saurabhjava;

import java.util.ArrayList;
import java.util.Scanner;

public class colorStrings {
    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<>();
//        System.out.println("Enter the number of colors you want to submit");
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=0;i<n;i++){
//            System.out.println("Enter the color no."+(i+1));
//            String s = sc.next();
//            colors.add(s);
//        }
//        System.out.println(colors);
        ArrayList<Integer> r = new ArrayList<>();
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);
        r.add(5);
        r.add(6);
        System.out.println(r);
        ArrayList<Integer> r2 = new ArrayList<>();
        for(int i = r.size()-1;i>=0;i--){
            r2.add(r.get(i));
        }
        System.out.println(r2);
        ArrayList<Integer> r3 = new ArrayList<>();
        r3.addAll(r2);
        r3.addAll(r);
        System.out.println(r3);
    }
}
