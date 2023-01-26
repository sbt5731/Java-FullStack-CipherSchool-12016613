package com.saurabhjava;
//Saurabh Tiwari 12016613   sbt5731@gmail.com
import java.util.ArrayList;
import java.util.Collections;
public class tallestSkyscrapper {
    public static void main(String[] args) {
        int list[][] = {
                {1,0,0,1},
                {0,0,1,1},
                {1,0,1,1},
                {0,1,0,1}};
        int count1 = 0;
        for(int i = 0; i< list.length;i++){
            if(list[i][0]==1) count1++;
            }
        ArrayList<Integer> tall = new ArrayList<>();
        tall.add(count1);
        int count2 = 0;
        for(int i = 0;i<list.length;i++){
            if(list[i][1] == 1) count2++;
        }
        tall.add(count2);
        int count3 = 0;
        for(int i = 0;i<list.length;i++){
            if(list[i][2] == 1) count3++;
        }
        tall.add(count3);
        int count4 = 0;
        for(int i = 0;i<list.length;i++){
            if(list[i][3] == 1) count4++;
        }
        tall.add(count4);
        Collections.sort(tall);
        System.out.println(tall.get(list.length-1));
    }
}
