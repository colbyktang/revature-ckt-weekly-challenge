package com.challenges.po;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeeklyChallenge_1003 {
    public static boolean isPinCode (String input) {
        if (input.equals("")) return false;
        String regex = "^(\\d|^\\s){4}$|^(\\d|^\\s){6}$";
        
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
  
        // True if username is valid.
        return m.matches();
    }
}