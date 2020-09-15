package romannumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralConverterTest {

    @Test
    public void testNumberOne() {
        String expected = "I";
        String result = RomanNumeralConverter.convertToRomanNumeral(1);
        assertEquals(expected, result);
    }

    @Test
    public void testNumberTwo() {
        String expected = "II";
        String result = RomanNumeralConverter.convertToRomanNumeral(2);
        assertEquals(expected, result);
    }

    @Test
    public void testNumberThree() {
        String expected = "III";
        String result = RomanNumeralConverter.convertToRomanNumeral(3);
        assertEquals(expected, result);
    }

    @Test
    public void testNumberFour() {
        String expected = "IV";
        String result = RomanNumeralConverter.convertToRomanNumeral(4);
        assertEquals(expected, result);
    }

    @Test
    public void testZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeralConverter.convertToRomanNumeral(0);
        });
    }

    @Test
    public void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeralConverter.convertToRomanNumeral(-274);
        });
    }

    @Test
    public void testAbove3999() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeralConverter.convertToRomanNumeral(4637);
        });
    }

    @Test
    public void testNumberSeven() {
        String expected = "VII";
        String result = RomanNumeralConverter.convertToRomanNumeral(7);
        assertEquals(expected, result);
    }

    @Test
    public void testNumber58() {
        String expected = "LVIII";
        String result = RomanNumeralConverter.convertToRomanNumeral(58);
        assertEquals(expected, result);
    }

    @Test
    public void testNumber258() {
        String expected = "CCLVIII";
        String result = RomanNumeralConverter.convertToRomanNumeral(258);
        assertEquals(expected, result);
    }

    @Test
    public void testNumber3527() {
        String expected = "MMMDXXVII";
        String result = RomanNumeralConverter.convertToRomanNumeral(3527);
        assertEquals(expected, result);
    }
}
