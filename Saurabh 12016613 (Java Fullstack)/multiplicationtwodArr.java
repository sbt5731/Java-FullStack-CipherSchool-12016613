package com.saurabhjava;

public class multiplicationtwodArr {
    public static void main(String[] args) {
        int testArr1[][] = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        int testArr2[][] = {{7,8,9},
                {4,5,6},
                {1,2,3}};
        int result[][] = new int[3][3];
        for(int i = 0;i< testArr1.length;i++) {
            for(int j = 0; j< testArr1[i].length;j++){
                result[i][j] = 0;
                for(int k = 0; k<3;k++){
                    result[i][j] += testArr1[i][k] * testArr2[k][j];
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
