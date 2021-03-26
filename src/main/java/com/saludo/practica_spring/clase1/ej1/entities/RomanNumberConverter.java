package com.saludo.practica_spring.clase1.ej1.entities;

public class RomanNumberConverter {

    private static final String[] M = {"", "M", "MM", "MMM"};
    private static final String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public String convertIntToRoman(int num) {
        if (num > 0 && num < 4000) {
            String thousands = M[num/1000];
            String hundreds = C[(num%1000)/100];
            String tens = X[(num%100)/10];
            String ones = I[num%10];
            return thousands + hundreds + tens + ones;
        } else {
            return "Only numbers between 1 and 3999 can be converter to roman number";
        }
    }
}
