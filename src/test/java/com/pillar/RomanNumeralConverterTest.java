package com.pillar;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralConverterTest {

    private RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    public void shouldConvertSingleRomanNumeralsToArabicEquivalent() {
        assertEquals(1, converter.convertRomanToArabic("I"));
        assertEquals(5, converter.convertRomanToArabic("V"));
        assertEquals(10,converter.convertRomanToArabic("X"));
        assertEquals(50,converter.convertRomanToArabic("L"));
        assertEquals(100,converter.convertRomanToArabic("C"));
        assertEquals(500,converter.convertRomanToArabic("D"));
        assertEquals(1000,converter.convertRomanToArabic("M"));
    }

}
