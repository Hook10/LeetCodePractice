package org.leetcode._48;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[][] matrix1 = {{1, 1, 1, 1},
                      {2, 2, 2, 2},
                      {3, 3, 3, 3},
                      {4, 4, 4, 4}
    };
    rotate(matrix1);
    for (int[] row : matrix1) {
      System.out.println(Arrays.toString(row));
    }

  }

  private static void rotate(int[][] matrix) {
    int n = matrix.length;
    // transpose
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        // swap matrix[i][j] with matrix[j][i]
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    // Reverse of rows
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n / 2; j++) {
        // swap matrix[i][j] with matrix[i][n - j - 1]
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][n - j - 1];
        matrix[i][n - j - 1] = temp;
      }
    }
  }
}
