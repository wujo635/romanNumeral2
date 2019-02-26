package com.pillar;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralConverterTest {

    private RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    public void shouldConvertRomanNumeralItoArabicValue1() {
        assertEquals(1, converter.convert("I"));
    }

    @Test
    public void shouldConvertRomanNumeralVToArabicValue5() {
        assertEquals(5, converter.convert("V"));
    }

}
