package org.leetcode._345;

public class Main {
    public static void main(String[] args) {
        String s = "leetcode";
        String expected = "expected leotcede";
        System.out.println(reverseVowels(s));
        System.out.println(expected);
    }

    private static String reverseVowels(String s) {
        int pointer1 = 0;
        int pointer2 = s.length() - 1;
        boolean vowelFound1 = false;
        boolean vowelFound2 = false;
        char[] array = s.toCharArray();
        while (pointer1 < pointer2) {
            if (isVowel(array[pointer1])) {
                vowelFound1 = true;
            } else {
                pointer1++;
            }

            if (isVowel(array[pointer2])) {
                vowelFound2 = true;
            } else {
                pointer2--;
            }

            if (vowelFound1 && vowelFound2) {
                char temp = array[pointer1];
                array[pointer1] = array[pointer2];
                array[pointer2] = temp;
                pointer1++;
                pointer2--;
                vowelFound1 = false;
                vowelFound2 = false;
            }

        }
        return new String(array);
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
