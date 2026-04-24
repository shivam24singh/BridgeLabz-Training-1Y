package com.gla.regex;

public class Hex {
    public static void main(String[] args) {
        String hex = "#FFA500";
        System.out.println(hex.matches("^#[0-9A-Fa-f]{6}$"));
    }
}