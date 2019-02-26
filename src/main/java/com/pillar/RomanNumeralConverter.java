package com.pillar;

public class RomanNumeralConverter {

    private static int[] arabicValues = new int[]{1, 5, 10, 50, 100, 500, 1000};
    private static String[] romanNumerals = new String[]{"I", "V", "X", "L", "C", "D", "M"};

    public int convert(String romanNumeral) {
        int value = -1;
        for (int index = 0; index < romanNumerals.length; index++) {
            if (romanNumeral.equals(romanNumerals[index])) {
                return arabicValues[index];
            }
        }
        return value;
    }
}
