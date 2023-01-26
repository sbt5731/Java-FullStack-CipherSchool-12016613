package com.saurabhjava;
//Saurabh Tiwari
public class binarySearchRec {
    public static int bsRec(int[] arr, int left, int right, int find){
        if(left>right){
            return -1;
        }
        int mid = (left+right)/2;

        if(find==arr[mid]){
            return mid;
        }

        else if ((find<arr[mid])){
            return bsRec(arr,left,mid-1,find);
        }
        else return bsRec(arr,mid+1,right,find);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,4,7,8,12,15,74};
        int find = 8;

        int left = 0;
        int right = arr.length-1;

        int index = bsRec(arr,left,right,find);
        if(index!=-1){
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Not found");
        }
    }
}
