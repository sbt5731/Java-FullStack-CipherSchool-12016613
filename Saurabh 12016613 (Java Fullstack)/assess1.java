package com.saurabhjava;
import java.util.*;
public class assess1 {
    public static void romanToInt(String s) {
        Map<Character,Integer> translations=new HashMap<>();
        //Adding elements to map
        translations.put('I',1);
        translations.put('V',5);
        translations.put('X',10);
        translations.put('L',50);
        translations.put('C',100);
        translations.put('D',500);
        translations.put('M',1000);
        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");
        int number = 0;
        for (int i = 0; i < s.length(); i++)
        {number = number + (translations.get(s.charAt(i)));}
        System.out.println(number);
    }
    public static void main (String[] args)
    {romanToInt("MCMII");}
}


