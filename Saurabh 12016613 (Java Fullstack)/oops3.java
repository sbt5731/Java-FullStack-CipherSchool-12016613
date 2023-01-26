package com.saurabhjava;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class oops3 {
    int productId;
    String productName;
    int price;
    String category;

    oops3(int productId, int price, String productName, String category) {
        this.productId = productId;
        this.price = price;
        this.productName = productName;
        this.category = category;
    }
    public String toString() {
        return this.productId+" " + this.productName+" " + this.price+ " " + this.category;
    }
    public static void main(String[] args) {
        oops3 o1 = new oops3(1,10,"Parle-G","Biscuits");
        oops3 o2 = new oops3(2,10,"Johnson","Hair-Oil");
        oops3 o3 = new oops3(3,10,"Xiaomi","Mobile");

        oops3[] oops3s = new oops3[]{o1,o2,o3};
        Stream<oops3> pro = Arrays.stream(oops3s);
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose any category: ");
        String c = sc.next();
        Stream<oops3> choose = pro.filter(e->(e.category).equalsIgnoreCase(c));
        choose.forEach(System.out::println);
}
}
