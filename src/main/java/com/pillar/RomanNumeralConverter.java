package com.pillar;

public class RomanNumeralConverter {

    private static int[] arabicValues = new int[]{1000, 500, 100, 50, 10, 5, 1};
    private static String[] romanNumerals = new String[]{"M", "D", "C", "L", "X", "V", "I"};

    public int convertRomanToArabic(String romanNumeral) {
        int value = -1;
        for (int index = 0; index < romanNumerals.length; index++) {
            if (romanNumeral.equals(romanNumerals[index])) {
                return arabicValues[index];
            }
        }
        return value;
    }

    public String convertArabicToRoman(int arabicValue) {
        if (arabicValue > 4999) return null;
        String romanNumeral = "";
        int remainingValue = arabicValue;
        while (remainingValue > 0) {
            for (int index = 0; index < arabicValues.length; index++) {
                if (remainingValue >= arabicValues[index]) {
                    romanNumeral += romanNumerals[index];
                    remainingValue -= arabicValues[index];
                }
            }
        }
        return romanNumeral;
    }
}
