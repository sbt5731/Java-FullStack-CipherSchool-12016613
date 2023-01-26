package com.saurabhjava;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name then enter and then your last name");
        String firstName = sc.next();
        String LastName = sc.next();
        char c = firstName.charAt(0);

        a1.add("Dear Mr. " + LastName+"." + c);

        System.out.println(a1);
    }
}
