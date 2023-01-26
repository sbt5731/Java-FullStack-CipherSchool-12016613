package com.saurabhjava;

import java.util.Scanner;

public class q1Day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n<1){
            System.out.println("Invalid Number");
        }
        for(int i = 1;i<=n/2;i++){
            if(n%i==0) System.out.print(i+ " ");
        }
        System.out.println(n);
    }
}
