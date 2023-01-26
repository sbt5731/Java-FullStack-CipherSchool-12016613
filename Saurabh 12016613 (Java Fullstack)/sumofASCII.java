package com.saurabhjava;


import java.util.Scanner;
//Contributed by Saurabh Tiwari 12016613
public class sumofASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String s = sc.next();
        s = s.toLowerCase();
        int sum = 0;
        System.out.println(s);
        for(int i = 0; i<s.length();i++) {
            sum = sum + (int)s.charAt(i);
        }
        System.out.println(sum);
    }
}
