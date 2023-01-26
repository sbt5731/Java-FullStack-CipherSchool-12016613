package com.saurabhjava;

import java.util.Scanner;
//12016613
//Saurabh Tiwari
//sbt5731@gmail.com
public class Sumof1standlst {
    private static int findTotaldigits(int n){
        int divisor,first;
        int sum;
        int last;
        last = n%10;
        int totalDigit = findDigit(n);
        divisor = (int)Math.pow(10,totalDigit-1);
        first = n/divisor;
        sum = first + last;
        return sum;
    }
    private static int findDigit(int n){
        int count = 0;
        while (n!=0){
            count++;
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int divisor;
//        int count = 0;
//        int first;
//        int last;
//        int sum =0 ;
        System.out.println("Enter a number");
        int n;
        n = sc.nextInt();
//        last = n%10;
//        while(n!=0){
//            count++;
//            n = n/10;
//        }


//        divisor = (int) Math.pow(10,count-1);
//        first = first/divisor;

        System.out.println(findTotaldigits(n));
    }
}
