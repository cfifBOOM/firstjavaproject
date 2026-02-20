package org.example;

public class Main {
    public static String get_age(int age) {
        if (age < 0) {
            return "не бывает";
        }
        else if (age < 18) {
            return "ребенок";
        }
        else if (age < 65) {
            return "взрослый";
        }
        else {
            return "пенсионер";
        }
    }

    public static void main(String[] args) {
        System.out.println(get_age(55));
    }
}