package com.saurabhjava;


import java.util.Scanner;

abstract class Doctor {
    abstract void treat();
}
class Physician extends Doctor{
    public void treat(){
        System.out.println("I treat patient with Medicine");
    }
}
class Surgeon extends Doctor{
    public void treat(){
        System.out.println("I treat patients with Surgery");
    }
}
class Dentist extends Doctor{
    public void treat(){
        System.out.println("I treat patients' teeth ");
    }
}

public class FunctionOverr {
    public static void main(String[] args) {

        Doctor doc = null;
        System.out.println("1. Physician" +
                "2. Surgeon" +
                "3. Dentist");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice==1) doc = new Physician();
        if(choice==2) doc = new Surgeon();
        if(choice==3) doc = new Dentist();

        assert doc != null;
        doc.treat();
    }
}
