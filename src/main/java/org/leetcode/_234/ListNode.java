package org.leetcode._234;

import java.util.Arrays;

public class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static boolean isPalindrome(ListNode head) { // 5 ms solution
    if (head == null || head.next == null) return true;

    int[] nums = new int[100_000];
    int index = 0;
    while (head != null) {
      nums[index] = head.val;
      index++;
      head = head.next;
    }

    int[] array = Arrays.copyOf(nums, index);

    int n = array.length / 2;
    for (int i = 0; i < n; i++) {
      if (array[i] != array[--index]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(3);

    ListNode b1 = new ListNode(0);
    ListNode b2 = new ListNode(2);

    a1.next = a2;
    a2.next = b1;
    b1.next = b2;
    boolean palindrome = ListNode.isPalindrome(a1);
    System.out.println(palindrome);
  }
}
