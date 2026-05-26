package com.example;

public class Hello {

    public static String greet() {
        return greet("World");
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greet());
    }
}
