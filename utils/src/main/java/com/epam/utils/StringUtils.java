package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str.length()==0 || str==null) {
            return false;
        }
        try {
            return Double.parseDouble(str)>0;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPositiveNumber("99"));
    }
}
