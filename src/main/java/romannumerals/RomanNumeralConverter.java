package romannumerals;

public class RomanNumeralConverter {

    public static String convertToRomanNumeral(int number) {
        if (number <= 0 || number > 3999) throw new IllegalArgumentException();
        return RomanConstants.THOUSANDS[number / 1000]
                + RomanConstants.HUNDREDS[(number % 1000) / 100]
                + RomanConstants.TENS[(number % 100) / 10]
                + RomanConstants.UNITS[number % 10];
    }

//    #10
//    public static String convertToRomanNumeral(int number) {
//        if (number <= 0 || number > 3999) throw new IllegalArgumentException();
//
//        String[] thousands = {"", "M", "MM", "MMM"};
//        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
//        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
//        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//
//        return thousands[number / 1000]
//                + hundreds[(number % 1000) / 100]
//                + tens[(number % 100) / 10]
//                + units[number % 10];
//    }

//    #9
//    public static String convertToRomanNumeral(int number) {
//        if (number <= 0 || number > 3999) throw new IllegalArgumentException();
//
//        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
//        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//
//        return tens[(number % 100) / 10] + units[number % 10];
//    }

//    #8
//    public static String convertToRomanNumeral(int number) {
//        if(number <= 0 || number > 3999) throw new IllegalArgumentException();
//        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//        return units[number];
//    }

//    #7
//    public static String convertToRomanNumeral(int number) {
//        if(number <= 0 || number > 3999) throw new IllegalArgumentException();
//        String[] units = {"", "I", "II", "III", "IV"};
//        return units[number];
//    }

//    #6
//    public static String convertToRomanNumeral(int number) {
//        if(number <= 0) throw new IllegalArgumentException();
//        String[] units = {"", "I", "II", "III", "IV"};
//        return units[number];
//    }

//    #5
//    public static String convertToRomanNumeral(int number) {
//        if(number == 0) throw new IllegalArgumentException();
//        String[] units = {"", "I", "II", "III", "IV"};
//        return units[number];
//    }

//    #4
//    public static String convertToRomanNumeral(int number) {
//        String[] units = {"", "I", "II", "III", "IV"};
//        return units[number];
//    }

//    #3
//    public static String convertToRomanNumeral(int number) {
//        return "I".repeat(number);
//    }

//    #2
//    public static String convertToRomanNumeral(int number) {
//        if(number == 1) return "I";
//        else if(number == 2) return "II";
//        return "";
//    }

//    #1
//    public static String convertToRomanNumeral(int number) {
//        return "I";
//    }
}
