package com.saurabhjava;

import java.util.Scanner;

public class assess3 {
    public static void main(String[] args) {
        System.out.println("Enter the length of arr1");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the elements of arr1");
        for(int i = 0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the length of arr2");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter the elements of arr2");
        for(int i = 0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int a1 = arr1.length/2;
        int a2 = arr2.length/2;
        int sum =0;
        sum = sum + arr1[a1]+arr2[a2];
        System.out.println(sum/2);
    }
}
