import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    public static final int[] SPECIAL_NUMBERS = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static final Map<Integer,String> SPECIAL_NUMBER_CONVERSIONS = new HashMap<Integer, String>();

    public String convertFromArabic(int arabicNumber) {
        SPECIAL_NUMBER_CONVERSIONS.put(1000, "M");
        SPECIAL_NUMBER_CONVERSIONS.put(900, "CM");
        SPECIAL_NUMBER_CONVERSIONS.put(500, "D");
        SPECIAL_NUMBER_CONVERSIONS.put(400, "CD");
        SPECIAL_NUMBER_CONVERSIONS.put(100, "C");
        SPECIAL_NUMBER_CONVERSIONS.put(90, "XC");
        SPECIAL_NUMBER_CONVERSIONS.put(50, "L");
        SPECIAL_NUMBER_CONVERSIONS.put(40, "XL");
        SPECIAL_NUMBER_CONVERSIONS.put(10, "X");
        SPECIAL_NUMBER_CONVERSIONS.put(9, "IX");
        SPECIAL_NUMBER_CONVERSIONS.put(5, "V");
        SPECIAL_NUMBER_CONVERSIONS.put(4, "IV");
        SPECIAL_NUMBER_CONVERSIONS.put(1, "I");

        String convertedNumber = "";

        for (int specialNumber : SPECIAL_NUMBERS) {
            while (arabicNumber >= specialNumber) {
                convertedNumber += SPECIAL_NUMBER_CONVERSIONS.get(specialNumber);
                arabicNumber -= specialNumber;
            }
        }

        return convertedNumber;
    }


}
