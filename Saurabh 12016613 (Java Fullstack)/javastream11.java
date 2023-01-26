package com.saurabhjava;

import java.util.Objects;
import java.util.stream.Stream;

public class javastream11 {
    public static void main(String[] args){
        Stream<String> list = Stream.of("abc","","bcd","","defg","jk");
        Stream<String> list1 = Stream.of("abc","","bcd","","defg","jk");
        Stream<String> ans = list1.filter(num-> Objects.equals(num, ""));
        int length = ans.toArray().length;
        System.out.println("List has "+ length+" empty Strings");
    }
}
