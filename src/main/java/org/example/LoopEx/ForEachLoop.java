package org.example.LoopEx;

public class ForEachLoop {

public void eachLoop(){


        int[] levels = {1, 2, 3, 4, 5, 6, 7, 8};

        int low = 8;

        for (int level : levels) {
            if (level < low)
                low = level;
        }
        System.out.println("Lowest level is: " + low);
    }

    public void HighLevel() {

        int[] levels = {1, 2, 3, 4, 5, 6, 7, 8};

        int max = 0;
        for (int level : levels) {
            if (level > max)
                max = level;
        }
        System.out.println("Highest level is: " + max);
    }
}