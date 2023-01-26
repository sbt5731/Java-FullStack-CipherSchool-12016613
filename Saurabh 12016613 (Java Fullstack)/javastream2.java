package com.saurabhjava;

import java.util.Arrays;
import java.util.stream.Stream;

public class javastream2 {
    public static void main(String[] args) {
        Stream<String> colors = Stream.of("Red","Blue","Yellow","Pink","Purple");

        String[] cart = new String[]{"iPhone","harmonKardon","Aura","JBL","Sony"};

        Stream<String> cartStream = Arrays.stream(cart);
        //using Streambuilder to create Stream

        Stream<String> beverages =Stream.<String>builder().add("Tea").add("Coffee").add("Juice").build();
        //Stream.generate
        Stream<String> s = Stream.generate(() -> ";)").limit(10);
        s.forEach(System.out::println);
    }
}
