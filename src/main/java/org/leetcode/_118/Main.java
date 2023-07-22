package org.leetcode._118;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println(generate(5));
    System.out.println(generate(1));
  }

  private static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();

    if (numRows == 0) return triangle;

    List<Integer> firstRow = new ArrayList<>();
    firstRow.add(1);
    triangle.add(firstRow);

    for (int i = 1; i < numRows; i++) {
      List<Integer> prevRow = triangle.get(i - 1);
      List<Integer> row = new ArrayList<>();

      row.add(1);

      for (int j = 1; j < i; j++) {
        row.add(prevRow.get(j - 1) + prevRow.get(j));
      }
      row.add(1);
      triangle.add(row);
    }
    return triangle;
  }
}
