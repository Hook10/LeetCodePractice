package org.leetcode._66;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] array = {9, 9};
    System.out.println(Arrays.toString(plusOne(array)));
  }

  public static int[] plusOne(int[] digits) {
    if (digits.length == 1 && digits[0] == 9) {
      return new int[]{1, 0};
    } else {
      for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] != 9) {
          ++digits[i];
          return digits;
        } else if (digits[i] == 9) {
          digits[i] = 0;
          if (i == 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
          }
        }
      }
    }
    return digits;
  }
}
