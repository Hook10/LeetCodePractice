package org.leetcode._8;

public class Main {
  public static void main(String[] args) {
//    System.out.println(myAtoi("42"));
    System.out.println(myAtoi("   4193 with words"));
//    System.out.println(myAtoi("008"));
  }

  private static int myAtoi(String s) {
   if (s.isEmpty()) {
     return 0;
   }

   int res = 0;
   int i = 0;
   int sign = 1;

   while (i < s.length() && s.charAt(i) == ' ') {
     i++;
   }

   if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
     if (s.charAt(i++) == '-') {
       sign = -1;
     }
   }
   while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
     if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)){
       if (sign == -1) {
         return Integer.MIN_VALUE;
       }
       return Integer.MAX_VALUE;
     }
     res = res * 10 + (s.charAt(i++) - '0');
   }
   return sign * res;
  }

}
