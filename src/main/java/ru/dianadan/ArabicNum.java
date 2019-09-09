package ru.dianadan;

public class ArabicNum {

    public static int toArabic(String number) {
        int n = 0;
        if (number.isEmpty()) return 0;
        if (number.startsWith("X")) return 10 + toArabic(number.replaceFirst("X", ""));
        if (number.startsWith("IX")) return 9 + toArabic(number.replaceFirst("IX", ""));
        if (number.startsWith("V")) return 5 + toArabic(number.replaceFirst("V", ""));
        if (number.startsWith("IV")) return 4 + toArabic(number.replaceFirst("IV", ""));
        if (number.startsWith("I")) return 1 + toArabic(number.replaceFirst("I", ""));
        throw new ArithmeticException();
    }


}