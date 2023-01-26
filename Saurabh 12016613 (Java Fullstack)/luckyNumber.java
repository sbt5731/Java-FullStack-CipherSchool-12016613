package com.saurabhjava;

import java.util.Scanner;

public class luckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (n>0){
            int temp = n%10;
            sum = sum + temp;
            n = n/10;
            count++;
        }
        if(count>4) System.out.println("invalid number");

        if(sum%3==0 || sum%5==0 || sum%7==0) System.out.println("Lucky Number");
        else System.out.println("Invalid Number");
    }
}
