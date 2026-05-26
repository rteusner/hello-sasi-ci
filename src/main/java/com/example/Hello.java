package com.example;

public class Hello {

    public static String greet() {
        return greet("Welt");
    }

    public static String greet(String name) {
        return "Hallo, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greet());
    }
}
