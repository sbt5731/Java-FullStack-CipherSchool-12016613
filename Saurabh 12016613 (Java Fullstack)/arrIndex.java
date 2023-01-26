package com.saurabhjava;
import java.util.Scanner;
public class arrIndex {
    public static int search(int[] arr,int n){
        System.out.println("Enter the number you want to search");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        for(int i = 0;i<n;i++){
            if(arr[i]==key){
                return i;}}
        return -1;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();}
        System.out.println(search(arr,n));
    }
}
