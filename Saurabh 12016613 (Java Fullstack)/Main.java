package com.saurabhjava;
//Saurabh Tiwari
//12016613
public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = new int[]{4,1, 8, 780, 4700, 65};
        int max = arr[0];
        int min = arr[0];
        for(int i = 1;i <arr.length; i++) {
            max = Math.max(max,arr[i]);
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i = 1; i<arr.length;i++){
            min = Math.min(min,arr[i]);
                if(arr[i]<min){
                    min = arr[i];
            }
        }
        System.out.println("Max is : " + max);
        System.out.println("Min is : " + min);
    }
}
