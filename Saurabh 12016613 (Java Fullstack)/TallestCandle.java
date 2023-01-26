package com.saurabhjava;

public class TallestCandle {
    public static void main(String[] args){
        int arr[] = new int[]{3,5,1,9,9};
        int max = arr[0];
        int count = 0;
        for(int i = 1; i<arr.length; i++) {
            if(arr[i]>max){
                max = Math.max(arr[i],max);
            }
        }
        System.out.println(max);
        for(int i = 0; i< arr.length;i++){
            if(arr[i]==max) {
                count++;
            }
        }
        System.out.println("Total tallest candles are " + count);
    }
}
