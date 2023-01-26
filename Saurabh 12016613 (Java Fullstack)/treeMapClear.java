package com.saurabhjava;

import java.util.TreeMap;

public class treeMapClear {
    public static void main(String[] args) {
        TreeMap<Integer,String> map= new TreeMap<>();
        map.put(1,"DSA");
        map.put(2,"JAVA");
        map.put(3,"ML");
        map.put(4,"Android");
        System.out.println("TreeMap : " + map);

        map.clear();
        System.out.println("And at last map looks like " + map);
    }
}
