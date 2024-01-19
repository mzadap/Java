package interview.strings.days100.codingbat.stringss;

public class MakeAbba {
    /*
        Day 02 Date - 23-12-2023
        * Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
        makeAbba("Hi", "Bye") → "HiByeByeHi"
        Abba("Yo", "Alice") → "YoAliceAliceYo"
        makeAbba("What", "Up") → "WhatUpUpWhat"
        * */

    public static void main(String[] args) {
        System.out.println(makeAbba("hi", "bye"));
        System.out.println(makeAbba("Yo", "Alice"));
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
