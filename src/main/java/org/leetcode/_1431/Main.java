package org.leetcode._1431;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] candies = new int[] {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        max -= extraCandies;
        Boolean[] array = new Boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            array[i] = candies[i] >= max;
        }
        return Arrays.asList(array);
    }
}
