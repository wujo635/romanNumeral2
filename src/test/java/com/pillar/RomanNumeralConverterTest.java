package com.pillar;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralConverterTest {

    private RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    public void shouldConvertSingleRomanNumeralsToArabicEquivalent() {
        assertEquals(1, converter.convertRomanToArabic("I"));
        assertEquals(5, converter.convertRomanToArabic("V"));
        assertEquals(10, converter.convertRomanToArabic("X"));
        assertEquals(50, converter.convertRomanToArabic("L"));
        assertEquals(100, converter.convertRomanToArabic("C"));
        assertEquals(500, converter.convertRomanToArabic("D"));
        assertEquals(1000, converter.convertRomanToArabic("M"));
    }

    @Test
    public void shouldConvertArabicValuesToSingleRomanNumeral() {
        assertEquals("I", converter.convertArabicToRoman(1));
        assertEquals("V", converter.convertArabicToRoman(5));
        assertEquals("X", converter.convertArabicToRoman(10));
        assertEquals("L", converter.convertArabicToRoman(50));
        assertEquals("C", converter.convertArabicToRoman(100));
        assertEquals("D", converter.convertArabicToRoman(500));
        assertEquals("M", converter.convertArabicToRoman(1000));
    }

    @Test
    public void shouldDisallowConvertingValuesGreaterThan4999() {
        assertEquals(null, converter.convertArabicToRoman(5000));
    }

    @Test
    public void shouldConvertArabicValuesRequiringMoreThanOneNumeral() {
        assertEquals("II", converter.convertArabicToRoman(2));
    }

    @Test
    public void shouldDisallowConvertingValuesLessThan1() {
        assertEquals(null, converter.convertArabicToRoman(0));
    }

    @Test
    public void shouldConvertArabicValuesRequiringSubtractedRomanNumeral() {
        assertEquals("IV", converter.convertArabicToRoman(4));
    }

    @Test
    public void shouldConvertArabicValuesRequiringMultipleSubtractedRomanNumerals() {
        assertEquals("XCIV", converter.convertArabicToRoman(94));
    }

}
