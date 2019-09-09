package ru.dianadan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    final static String PATTERN_ARABIC_NUM = "\\s*([1-9]|10)\\s*[\\+|\\-|\\*|\\/]\\s*([1-9]|10)\\s*";
    final static String PATTERN_ROMAN_NUM = "\\s*([I]{1,3}|IV|V[I]{0,3}|IX|X)\\s*[\\+|\\-|\\*|\\/]\\s*([I]{1,3}|IV|V[I]{0,3}|IX|X)\\s*";

    public static Operation getOperation(String str) {
        Matcher matcher_arabic_num = Pattern.compile(PATTERN_ARABIC_NUM).matcher(str);
        Matcher matcher_roman_num = Pattern.compile(PATTERN_ROMAN_NUM).matcher(str);

        if (matcher_arabic_num.matches() || matcher_roman_num.matches()) {
            String[] arg = str.trim().split("\\+|\\-|\\*|\\/");
            int a, b;
            boolean isRomanNum;
            char operator;
            if (matcher_roman_num.matches()) {
                a = ArabicNum.toArabic(arg[0].trim());
                b = ArabicNum.toArabic(arg[1].trim());
                isRomanNum = true;
                operator = str.replaceAll("\\s*([I]{1,3}|IV|V[I]{0,3}|IX|X)\\s*", "").charAt(0);

            } else {
                a = Integer.parseInt(arg[0].trim());
                b = Integer.parseInt(arg[1].trim());
                isRomanNum = false;
                operator = str.replaceAll("\\s*([1-9]|10)\\s*", "").charAt(0);
            }
            return new Operation(a, b, operator, isRomanNum);
        }
        System.out.println("Некорректные входные данные");
        return null;
    }

}

