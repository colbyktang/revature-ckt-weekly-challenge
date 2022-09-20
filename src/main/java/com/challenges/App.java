package com.challenges;

import com.challenges.streams.RevatureAssessmentWeek3;
import com.challenges.streams.Streaming;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        // Streaming.Test();
        // System.out.println(RevatureAssessmentWeek3.question1(142345));
        int num = 4135;
        System.out.println(num + "->" + RevatureAssessmentWeek3.rearrangeTheDigitsStream(num));
        // System.out.println(RevatureAssessmentWeek3.question2(20, 72, 4, new int[] {61, 20, 72, 53}));
        // RevatureAssessmentWeek3.question3(10, new int[] {10, 8, 3, 5, 2, 1, 5, 10, 2, 8});
    }
}
