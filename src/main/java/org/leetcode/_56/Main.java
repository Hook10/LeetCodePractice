package org.leetcode._56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    merge(new int[][]{
        {8, 10},
        {1, 3},
        {2, 6},
        {15, 18}
    });
  }

  private static int[][] merge(int[][] intervals) {
    if (intervals.length <= 1) return intervals;

    Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

    List<int[]> outputArr = new ArrayList<>();
    int[] currentInterval = intervals[0];
    outputArr.add(currentInterval);

    for (int[] interval : intervals) {
      int curEnd = currentInterval[1];
      int nextBeg = interval[0];
      int nextEnd = interval[1];

      if (curEnd >= nextBeg) {
        currentInterval[1] = Math.max(curEnd, nextEnd);
      } else {
        currentInterval = interval;
        outputArr.add(currentInterval);
      }
    }
    return outputArr.toArray(new int[outputArr.size()][]);
  }
}