package com.saurabhjava;

import java.util.Scanner;

public class countOFDigit {
    private static int count(int n){
        int counts = 0;
        if(n<10) return 1;
        else {
            while(n!=0){
                counts++;
                n = n/10;
            }
        }
        return counts;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
}
