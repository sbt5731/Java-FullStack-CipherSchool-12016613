package com.saurabhjava;

import java.util.Scanner;

public class maxThird {
    static public int getThirdLargestArr(int []arr,int n){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i = 0; i<n;i++){
            if(arr[i]>first)
                first = arr[i];
        }
        for(int i = 0; i<n;i++){
            if(arr[i]>second && arr[i]<first)
                second = arr[i];
        }
        for(int i = 0; i<n;i++){
            if(arr[i]>third && arr[i]<second)
                third = arr[i];
        }
        return third;
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println();
        System.out.println("Enter the element of the array");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(n<4)
        System.out.println("Does not exist");
        System.out.println("Third largest element is "+getThirdLargestArr(arr,n));
    }
}
