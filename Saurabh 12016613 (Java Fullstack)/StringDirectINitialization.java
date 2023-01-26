package com.saurabhjava;

import java.util.Scanner;

public class StringDirectINitialization {
    public static void main(String[] args) {
        String[] heroes = {"Hulk","Captain America","Iron Man","Thor","Bucky"};
        for(String i:heroes){
            System.out.println("I am " + i);
        }
        System.out.println();
        int serialNo[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i:serialNo){
            System.out.println("Enter the serial No: ");
            int ss = sc.nextInt();
        }
        System.out.println();
    }
}
