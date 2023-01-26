package com.saurabhjava;

import java.util.Scanner;
//Saurabh Tiwari 12016613 sbt5731@gmail.com
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{7,9,5,6,8};
//        for(int i = 0; i<arr.length;i++) {
//            arr[i] = sc.nextInt();
//        }
        System.out.println("Array without sorting");
        for(int i = 0;i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0;i< arr.length;i++) {
            for(int j = i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j ];
                    arr[j ] = temp;
                }
            }
        }
        System.out.println("After Sorting");
        for (int i = 0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

    }
}