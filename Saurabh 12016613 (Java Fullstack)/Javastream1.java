package com.saurabhjava;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class Javastream1 {
    public static void main(String[] args) {
        // Java stream api
        //Stream refers to the set of builtin function that lets us process the data
        //quickly and faster
        // The primarily known as functinal programming
        // THe primary motivve of using stream api is to "DO MORE WITH LESS LINES OF CODES
        ////short/simple/faster/elegant
        Stream<String> emptyStream = Stream.empty();
        //other methods of creating stream.
        // We can create stream from arrays
        Collection<String> courses = Arrays.asList("JAVA","PHP","DotNET","C#","JQUERY");
        Stream<String> courseStream = courses.stream();
        System.out.println(courseStream);
    }
}
