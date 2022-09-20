package com.challenges.week5;

import java.util.StringJoiner;

public class TimeInWords {
    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
        // Write your code here
        String retString = "";
        // Minutes
        if (m == 0) retString += getHourWord(h) + " o' clock";
        else if (1 <= m && m <= 30) retString += getMinuteWord(m) + " past " + getHourWord(h);
        else if (30 < m) retString += getMinuteWord(m) + " to " + getHourWord(h + 1);

        return retString.replaceAll("\\s+", " ");
    }

    public static String getHourWord (int h) {
        if (h > 12) {
            h -= 12;
        }
        return getWord(h);
    }

    public static String getMinuteWord (int m) {
        if (m == 1 || m == 59) return "one minute";
        if (m == 30) return "half";
        if (m % 15 == 0) return "quarter";
        if (m <= 20) return getWord(m) + " minutes";
        if (m < 30) return "twenty " + getWord(m - 20) + " minutes";
        if (m <= 40) return "twenty " + getWord(40 - m) + " minutes";
        if (m > 40) return getWord(60 - m) + " minutes";

        return "";
    }

    public static String getWord (int n) {
        switch (n) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            case 20: return "twenty";
        }
        return "";
    }

}
