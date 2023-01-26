package com.saurabhjava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class D5Q1 {
    public static double Average(int[] grades,int max)

    {
        int sum = 0;
        double average = 0.0;
        for (int i = 1; i < max; i++) {
            sum += grades[i];
            average = (double) sum / (double) i;
        }
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat num = new DecimalFormat(".00");
        int i;
        int [] grades = new int[20];
        for(i = 0; i<20;i++){
            System.out.print("Enter Grade " + (i+1)+" ");
            grades[i] = sc.nextInt();
            if(grades[i]==-1) break;
        }
        System.out.println(num.format(Average(grades,i-1)));
    }
}
