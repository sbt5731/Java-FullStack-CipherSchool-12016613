package com.saurabhjava;

import java.util.Optional;
import java.util.stream.Stream;

public class javastream6 {
    public static void main(String[] args){
        Stream<Integer> s = Stream.of(1,2,3,4,5);
        Optional<Integer> ans = s.reduce((a,b)->a+b);
        System.out.println(ans);
    }
}
