////////////////////////////////////////////////////////////////////
// MATTIA CADAMURO 2111534
// MICHELE TESSER 2111012
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    private static final int[] values = {50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convert(int number) {
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length && number >= 0; i++) {
            while (values[i] <= number) {
                number -= values[i];
                roman.append(symbols[i]);
            }
        }
        return roman.toString();
    }
}