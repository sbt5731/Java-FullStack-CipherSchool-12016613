package com.saurabhjava;

import java.util.Scanner;
//Saurabh Tiwari
//12016613
//This code is contributed by me
public class SumofDigit {
    public static void main(String[] args){

        for(int i = 1;i<=50;i++){
            if (i%3==0 && i%5==0){
                System.out.println("funstask");
            }



            else if(i%5==0) System.out.println("task");
            else if(i%3==0) System.out.println("fun");
        }
    }
}
