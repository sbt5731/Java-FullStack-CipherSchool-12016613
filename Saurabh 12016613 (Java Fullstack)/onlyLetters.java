package com.saurabhjava;

import java.util.Scanner;
//Saurabh Tiwari 12016613   sbt5731@gmail.com
public class onlyLetters {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replaceAll("[^a-zA-Z]","");
        System.out.println(s);
        char c[] = s.toCharArray();
        c[0] = Character.toLowerCase(c[0]);
        String output  = new String(c);
        System.out.println(output);
    }
}
