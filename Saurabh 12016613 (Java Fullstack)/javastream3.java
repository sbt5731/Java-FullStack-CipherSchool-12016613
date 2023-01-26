package com.saurabhjava;

import java.util.Arrays;
import java.util.stream.Stream;

public class javastream3 {
    public static void main(String[] args) {
        String[] cart = new String[]{"Iphone","harmonKardon","Aura","JBL","Sony"};
        Stream<String > cartStream = Arrays.stream(cart);
        cartStream.forEach(System.out::println);


        // filtering

        Stream<Integer> lucky = Stream.of(5,7,8,3,15,56,51,56);
        lucky.forEach(System.out::println);
        Stream<Integer> lucky1 = Stream.of(5,7,8,3,15,56,51,56);

        // fetch only even numbers
        Stream<Integer> evenNubers = lucky1.filter(num-> num%2==0);
        evenNubers.forEach(System.out::println);
    }
}
