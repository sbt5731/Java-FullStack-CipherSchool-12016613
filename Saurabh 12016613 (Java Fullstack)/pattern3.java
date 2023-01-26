package com.saurabhjava;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum1  = 0;
        int sum2 = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='#') sum1++;
            if(s.charAt(i)=='*') sum2++;
        }
        if(sum1>sum2){
            System.out.println(sum1-sum2);
        }
        if(sum2>sum1)
        System.out.println(sum2-sum1);
    }
}
