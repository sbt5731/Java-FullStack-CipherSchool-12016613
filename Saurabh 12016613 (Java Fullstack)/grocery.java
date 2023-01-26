package com.saurabhjava;

public class grocery {
    public static void main(String[] args) {
        String arr[] = new String[]{"Milk","Bread","Butter","Rusk","Eggs"};
        for(int i = 0; i<arr.length;i++) {
            System.out.println("Product no: " + (i+1) + " is " + arr[i]);
        }
    }
}
