package com.saurabhjava;

import java.util.stream.Stream;

public class javastream5 {
    public static void main(String[] args) {
        Stream<Integer> weightlbs = Stream.of(110,145,180,174,192,180);
        weightlbs.forEach(System.out::println);
        Stream<Integer> weightlbs1 = Stream.of(110,145,180,174,192,180);
        Stream<Double> kgWeight = weightlbs1.map(num -> num*0.45359237);
        kgWeight.forEach(System.out::println);
    }
}
