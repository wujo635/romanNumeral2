package com.pillar;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralConverterTest {

    private RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    public void shouldConvertSingleRomanNumeralsToArabicEquivalent() {
        assertEquals(1, converter.convert("I"));
        assertEquals(5, converter.convert("V"));
        assertEquals(10,converter.convert("X"));
        assertEquals(50,converter.convert("L"));
        assertEquals(100,converter.convert("C"));
        assertEquals(500,converter.convert("D"));
        assertEquals(1000,converter.convert("M"));
    }

}
