package com.saurabhjava;

import java.util.Scanner;
//Saurabh Tiwari 12016613 sbt5731gmail.com
public class
totalScore {
    public static int findTotal(int[] score) {
        if(score.length>11){
            return -1;
        }
        int sum = 0;
        for(int i = 0; i<score.length;i++){
            sum = sum + score[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score[] = new int[n];
        System.out.println("Enter the score");
        for(int i = 0; i< score.length;i++) {
            score[i] = sc.nextInt();
        }
        System.out.println(findTotal(score));
    }
}
