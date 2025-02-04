package org.leetcode._67;

public class Main {
  public static void main(String[] args) {
    String a = "11";
    String b = "1";
    System.out.println(addBinary2(a, b));
  }

  private static String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry == 1) {
      if (i >= 0) {
        carry += a.charAt(i--) - '0';
      }
      if (j >= 0) {
        carry += b.charAt(j--) - '0';
      }
      sb.append(carry % 2);
      carry /= 2;
    }
    return sb.reverse().toString();
  }

  private static String addBinary2(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;
    while (i >= 0 || j >= 0) {
      int sum = carry;
      if (i >= 0) sum += a.charAt(i) - '0';
      if (j >= 0) sum += b.charAt(j) - '0';
      sb.append(sum % 2);
      carry = sum / 2;
      i--;
      j--;
    }
    if (carry != 0) sb.append(1);

    return sb.reverse().toString();
  }
}
