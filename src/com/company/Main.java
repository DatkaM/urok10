package com.company;

public class Main {

    public static void main(String[] args) {

        at("Elnura", "Shirin","Uulkan");

    }
    static void at (String ... b) {
        for (String a : b) {
            System.out.println("I love YOU " + a);
        }
    }
}
