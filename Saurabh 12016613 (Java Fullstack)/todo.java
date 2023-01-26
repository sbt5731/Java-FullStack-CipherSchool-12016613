package com.saurabhjava;
//Saurabh Tiwari 12016613 sbt5731@gmail.com
import java.util.ArrayList;
import java.util.Scanner;

public class todo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tasks you want to add");
        int n = sc.nextInt();
        ArrayList<String> s = new ArrayList<>();
        String temp = "";
        for(int i = 1;i<=n;i++){
            System.out.println("Enter the task no."+i);
            temp = sc.next();
            s.add(temp);
        }
        System.out.println(s);
        System.out.println(s.get(0));
        if(s.size()>3){
        s.remove(1);
        System.out.println(s);}
    }
}
