package com.saurabhjava;

public class pattern {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j =1 ; j <=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        for (int i = 4; i >=1; i--) {
            for (int j =1 ; j <=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
