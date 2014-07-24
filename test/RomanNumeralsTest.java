import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @Before
    public void setUp() throws Exception {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void shouldReturnBlankForNumberZero() throws Exception {
        assertEquals("", romanNumerals.convertFromArabic(0));

    }

    @Test
    public void shouldReturnIForNumberOne() throws Exception {
        assertEquals("I", romanNumerals.convertFromArabic(1));
    }

    @Test
    public void shouldReturnIIForNumberTwo() throws Exception {
        assertEquals("II", romanNumerals.convertFromArabic(2));
    }

    @Test
    public void shouldReturnIVForNumberFour() throws Exception {
        assertEquals("IV", romanNumerals.convertFromArabic(4));
    }

    @Test
    public void shouldReturnVForNumberFive() throws Exception {
        assertEquals("V", romanNumerals.convertFromArabic(5));
    }

    @Test
    public void shouldReturnVIForNumberSix() throws Exception {
        assertEquals("VI", romanNumerals.convertFromArabic(6));
    }

    @Test
    public void shouldReturnIXForNumberNine() throws Exception {
        assertEquals("IX", romanNumerals.convertFromArabic(9));
    }

    @Test
    public void shouldReturnXForNumberTen() throws Exception {
        assertEquals("X", romanNumerals.convertFromArabic(10));
    }

    @Test
    public void shouldReturnXXForNumberTwenty() throws Exception {
        assertEquals("XX", romanNumerals.convertFromArabic(20));
    }

    @Test
    public void shouldReturnXLForNumberForty() throws Exception {
        assertEquals("XL", romanNumerals.convertFromArabic(40));
    }

    @Test
    public void shouldReturnLForNumberFifty() throws Exception {
        assertEquals("L", romanNumerals.convertFromArabic(50));
    }

    @Test
    public void shouldReturnXCForNumberNinety() throws Exception {
        assertEquals("XC", romanNumerals.convertFromArabic(90));
    }

    @Test
    public void shouldReturnCForNumberHundred() throws Exception {
        assertEquals("C", romanNumerals.convertFromArabic(100));
    }

    @Test
    public void shouldReturnCDForNumberFourHundred() throws Exception {
        assertEquals("CD", romanNumerals.convertFromArabic(400));
    }

    @Test
    public void shouldReturnDForNumberFiveHundred() throws Exception {
        assertEquals("D", romanNumerals.convertFromArabic(500));
    }

    @Test
    public void shouldReturnCMForNumberNineHundred() throws Exception {
        assertEquals("CM", romanNumerals.convertFromArabic(900));
    }

    @Test
    public void shouldReturnMForNumberOneThousand() throws Exception {
        assertEquals("M", romanNumerals.convertFromArabic(1000));
    }

    @Test
    public void shouldReturnMCMXCIXForNumber1999() throws Exception {
        assertEquals("MCMXCIX", romanNumerals.convertFromArabic(1999));

    }

    @Test
    public void shouldReturnMMMCDXCVIIForNumber3497() throws Exception {
        assertEquals("MMMCDXCVII", romanNumerals.convertFromArabic(3497));

    }

    @Test
    public void shouldReturnMMMMMMMMMCMXCIXForNumber9999() {
        assertEquals("MMMMMMMMMCMXCIX", romanNumerals.convertFromArabic(9999));
    }
}
