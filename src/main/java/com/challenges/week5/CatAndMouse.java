package com.challenges.week5;

public class CatAndMouse {

    // int x: Cat A's position
    // int y: Cat B's position
    // int z: Mouse C's position
    // Complete the catAndMouse function below.
    public static String catAndMouse(int x, int y, int z) {
        int catADistance = Math.abs(x - z);
        int catBDistance = Math.abs(y - z);

        if (catADistance == catBDistance) {
            return "Mouse C";
        }
        else if (catADistance < catBDistance) {
            return "Cat A";
        }
        return "Cat B";
    }
}
