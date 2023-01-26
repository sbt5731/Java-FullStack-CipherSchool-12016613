package com.saurabhjava;

import java.util.Scanner;
//12016613  //Saurabh Tiwari  //sbt5731@gmail.com
public class Hailstone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=1){
            System.out.print(n+"-");
            if(n%2==1){
                n = n*3 + 1;
            } else {
                n= n/2;
            }
        }
    }
}
