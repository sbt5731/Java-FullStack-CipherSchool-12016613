package com.saurabhjava;
import java.util.Scanner;
//Saurabh Tiwari  12016613
public class thirdMAx {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
//        Arrays.sort(arr);
        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if(n<3) System.out.println("Doesn't Exist");
        for(int i = 0; i<n-1 ;i ++){
            if(arr[i]!=arr[i+1]){
                continue;
            }
            else{
                System.out.println("Doesn't Exist");
            }
        }
        System.out.println(arr[2]);
//        if(n<3) System.out.println("Doesn't exist");
//        System.out.println(arr[2]);

    }
}
