package com.saurabhjava;

import java.util.HashMap;
import java.util.Scanner;
// Saurabh Tiwari // 12016613 sbt5731@gmail.com
public class RajansEncri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        s = stringBuilder.toString();
        char[] arr = s.toCharArray();
        for(int i = 0; i< arr.length;i++){
            if(arr[i]=='a') arr[i] = '0';
            if(arr[i]=='e') arr[i] = '1';
            if(arr[i]=='i') arr[i] = '2';
            if(arr[i]=='o') arr[i] = '3';
            if(arr[i]=='u') arr[i] = '4';
        }
        StringBuilder stringBuilder1 = new StringBuilder();
        for(char i:arr){
            stringBuilder1.append(i);
        }
        String s1 = stringBuilder1.toString();
        System.out.println(s1+ "aca");
    }
}
