package com.challenges.week5;

import java.util.List;

public class QueensAttackII {
    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return (int) the number of squares the queen can attack.
     * The function accepts following parameters:
     *  1. INTEGER sq: the number of rows and columns in the board
     *  2. INTEGER k: the number of obstacles on the board
     *  3. INTEGER rQn: int r_q: the row number of the queen's position
     *  4. INTEGER cQn: the column number of the queen's position
     *  5. 2D_INTEGER_ARRAY obstacles: each element is an array of  integers, the row and column of an obstacle
     *  
     *  0 < n < 10^5
     *  0 <= k <= 10^5
     *  A single cell may contain more than one obstacle.
     *  There will never be an obstacle at the position where the queen is located.
     */
    public static int queensAttack(int sq, int k, int rQn, int cQn, List<List<Integer>> obstacles) {
        // Write your code here
        int numOfSquares = 0;

        // Calculate all possible squares in each direction
        // row is up/down
        // column is left/right
        // do not include queen's square
        int up = sq - rQn; // up
        int dn = rQn - 1; // down
        int lf = cQn - 1; // left
        int rt = sq - cQn; // right

        // Take whichever one is the shortest
        int upLf = Math.min (up, lf); // up left
        int upRt = Math.min (up, rt); // up right
        int dnLf = Math.min (dn, lf); // down left
        int dnRt = Math.min (dn, rt); // down right

        // For each obstacle, see if it limits moves
        for (List<Integer> obstacle : obstacles) {
            int rOb = obstacle.get(0);
            int cOb = obstacle.get(1);

            // if obstacle is on same row, limit moves
            // obstacle cannot be on the queen so it cannot be equal to 0
            // Use Math.min in case there's an obstacle behind another one
            if (rOb == rQn) {
                
                // obstacle is to the left
                if (cOb < cQn) 
                { lf = Math.min (lf, cQn - cOb - 1); }
                // obstacle is to the right
                else if (cOb > cQn)
                { rt = Math.min (rt, cOb - cQn - 1); }
                
                // continue to the next obstacle
                continue;
            }

            // if obstacle is on same column, limit moves
            // obstacle cannot be on the queen so (rQn - 1)
            // Use Math.min in case there's an obstacle behind another one
            else if (cOb == cQn) {

                // obstacle is up
                if (rOb > rQn)
                { up = Math.min (up, rOb - rQn - 1); }
                // obstacle is down
                else if (rOb < rQn)
                { dn = Math.min (dn, rQn - rOb - 1); }

                // continue to the next obstacle
                continue;
            }

            // handle intercardials
            // if obstacle is column==row distance away then it's diagonal
            // Use Math.min in case there's an obstacle behind another one

            if (Math.abs (cOb - cQn) == Math.abs (rOb - rQn)) {
                // upper left: rOb > rQn is up, cOb < cQn is left
                if (rOb > rQn && cOb < cQn) {
                    upLf = Math.min (upLf, rOb - rQn - 1);
                }
                // upper right: rOb > rQn is up, cOb > cQn is right
                else if (rOb > rQn && cOb > cQn) {
                    upRt = Math.min (upRt, rOb - rQn - 1);
                }
                // lower right: rOb < rQn is down, cOb > cQn is right
                else if (rOb < rQn && cOb > cQn) {
                    dnRt = Math.min (dnRt, rQn - rOb - 1);
                }
                // lower left: rOb < rQn is down, cOb < cQn is left
                else if (rOb < rQn && cOb < cQn) {
                    dnLf = Math.min (dnLf, rQn - rOb - 1);
                }
            }
        }

        // Add all the directions clockwise from north
        numOfSquares += up + upRt + rt + dnRt + dn + dnLf + lf + upLf;
        return numOfSquares;
    }
}
