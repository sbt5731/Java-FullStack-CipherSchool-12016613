package com.saurabhjava;

public class nestedTwoDArr {
    public static void main(String[] args) {
        int testArr1[][] = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        int testArr2[][] = {{7,8,9},
                {4,5,6},
                {1,2,3}};
        for(int i = 0; i< testArr1.length;i++){
            for(int j = 0;j< testArr1[i].length;j++){
                System.out.print(testArr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
