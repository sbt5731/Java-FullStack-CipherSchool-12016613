package com.saurabhjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class javastream12 {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany",
                "Italy", "U.K.","Canada");
        String ans = countries.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining("-"));
        System.out.println(ans);
    }
}
