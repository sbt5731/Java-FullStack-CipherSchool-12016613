package com.saurabhjava;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class javastream4 {
    public static void main(String[] args) {
        String[] cart = new String[]{"Rohan","Oarman","Preeti","Avinash","Abhinav"};
        Stream<String > cartStream = Arrays.stream(cart);
        cartStream.forEach(System.out::println);
        cartStream.close();
        Stream<String > cartStream1 = Arrays.stream(cart);
        Stream<String> vowels = cartStream1.filter(num->num.charAt(0)=='A'||
                num.charAt(0)=='E'||num.charAt(0)=='I'||num.charAt(0)=='O'||num.charAt(0)=='U');
        vowels.forEach(System.out::println);


    }
}
