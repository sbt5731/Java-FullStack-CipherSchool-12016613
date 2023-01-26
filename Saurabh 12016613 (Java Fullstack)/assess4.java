package com.saurabhjava;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class assess4 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int l = sc.nextInt();
        System.out.println("Enter the elements");
        int[] a = new int[l];
        for(int i = 0; i<l;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(thirdMax(a));
    }
    static int thirdMax(int[] a)
    {
        Set<Integer> maxElements = new HashSet<>();
        for(int element : a)
        {
            maxElements.add(element);
            if(maxElements.size() > 3)
                maxElements.remove(Collections.min(maxElements));
        }
        if(maxElements.size() == 3)
            return Collections.min(maxElements);
        return Collections.max(maxElements);
    }
}
