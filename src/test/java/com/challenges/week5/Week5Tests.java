package com.challenges.week5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.challenges.week5.BillDivision;
import com.challenges.week5.CaesarCipher;
import com.challenges.week5.QueensAttackII;
import com.challenges.week5.TimeInWords;

public class Week5Tests {

    @Test
    public void bonAppetitTest() {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(10);
        BillDivision.bonAppetit(bill, 1, 12);
    }

    @Test
    public void caesarCipherTest() {
        System.out.println(CaesarCipher.caesarCipher("middle-Outz", 2));
    }

    @Test
    public void timeInWordsTest() {
        int h = 5;
        int m = 47;
        String output = TimeInWords.timeInWords(h, m);
        System.out.println(output);
        assertEquals ("thirteen minutes to six", output);

        h = 3;
        m = 00;
        String output2 = TimeInWords.timeInWords(h, m);
        System.out.println(output2);
        assertEquals ("three o' clock", output2);

        h = 7;
        m = 15;
        String output3 = TimeInWords.timeInWords(h, m);
        System.out.println(output3);
        assertEquals ("quarter past seven", output3);
        
        /*
        for (int hour = 1; hour <= 12; hour++) {
            for (int min = 0; min < 60; min++) {
                System.out.println(TimeInWords.timeInWords(hour, min));
            }
            System.out.println("-------------------");
        }
        */
    }

    @Test
    public void queensTest() {
        int n = 4;
        int k = 0;
        int r_q = 4;
        int c_q = 4;

        List<List<Integer>> obstacles = new ArrayList<>();
        int output = QueensAttackII.queensAttack(n, k, r_q, c_q, obstacles);
        assertEquals(9, output);

        n = 5;
        k = 3;
        r_q = 4;
        c_q = 3;

        obstacles = new ArrayList<>();
        obstacles.add(Arrays.asList(5,5));
        obstacles.add(Arrays.asList(4,2));
        obstacles.add(Arrays.asList(2,3));
        output = QueensAttackII.queensAttack(n, k, r_q, c_q, obstacles);
        assertEquals(10, output);

        n = 1;
        k = 0;
        r_q = 1;
        c_q = 1;

        obstacles = new ArrayList<>();
        output = QueensAttackII.queensAttack(n, k, r_q, c_q, obstacles);
        assertEquals(0, output);

        n = 5;
        k = 5;
        r_q = 4;
        c_q = 3;

        obstacles = new ArrayList<>();
        obstacles.add(Arrays.asList(5,5));
        obstacles.add(Arrays.asList(4,2));
        obstacles.add(Arrays.asList(2,3));
        obstacles.add(Arrays.asList(2,1));
        obstacles.add(Arrays.asList(5,4));
        output = QueensAttackII.queensAttack(n, k, r_q, c_q, obstacles);
        assertEquals(8, output);
    }
}
