package com.challenges.week5;

import java.util.stream.Stream;

public class CaesarCipher {
    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */
    public static String caesarCipher(String s, int k) {
        // ASCII values for lowercase letters = 97-122
        // ASCII values for uppercase letters = 65-90
        String retString = "";

        int LC_LOWER = 97;
        int LC_UPPER = 123;
        int UC_LOWER = 65;
        int UC_UPPER = 91;

        char[] sArray =  s.toCharArray();
        for (char ch : sArray) {
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    ch = (char) ((((int)ch - UC_LOWER + k) % (UC_UPPER-UC_LOWER)) + UC_LOWER);
                }
                else {
                    ch = (char) ((((int)ch - LC_LOWER + k) % (LC_UPPER-LC_LOWER)) + LC_LOWER);
                }
            }
            retString += ch;
        }
        return retString;
    }
}
