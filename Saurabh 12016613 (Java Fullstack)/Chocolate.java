package com.saurabhjava;

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        System.out.println("Enter the number of chocolates");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter the price of 1 chocolate");
        int c = sc.nextInt();
        int total = m/c;
        int rem = m%c;
        int wrapper = total/3;
        System.out.println(total+rem+wrapper);
    }
}
