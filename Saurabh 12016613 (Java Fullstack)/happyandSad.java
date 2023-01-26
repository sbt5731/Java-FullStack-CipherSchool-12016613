package com.saurabhjava;
//12016613 Saurabh Tiwari sbt5731@gmail.com
import java.util.Scanner;

public class happyandSad {
     static String isDivisible(int num)
    {
       int length = totallength(num);
       int arr[] = new int[length];
       for(int i = 0; i<length;i++){
           arr[i] = num%10;
           num = num/10;
       }
       for(int i = 0; i< length;i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println("Checking for the type");
       for(int i = 0; i<arr.length; i++){
           for(int j = i+1; j<arr.length-1; j++){
               if(!(arr[i]%arr[j]==0)){
                   return "Sad Number";
               }
           }
       }
       return "Happy Number";
    }
    static int totallength(int num) {
        int count = 0;
        while(num!=0){
            count++;
            int digit = num%10;
            num= num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replace(",","");
        System.out.println(s);
        int num = Integer.parseInt(s);
        System.out.println(isDivisible(num));

    }
}
