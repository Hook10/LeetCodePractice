package org.leetcode._234;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
  public static void main(String[] args ){
    ListNode five = new ListNode(5, null);
    ListNode four = new ListNode(1, null);
    ListNode three = new ListNode(2, four);
    ListNode two = new ListNode(2, three);
    ListNode head = new ListNode(1, two);

    boolean palindrome = isPalindrome(head);
    System.out.println(palindrome);
  }

//  this solution is bruteforce approach 26ms
  private static boolean isPalindrome(ListNode head) {
    if (head == null) return false;
    if (head.next == null) return true;

    List<Integer> list = new ArrayList<>();
    ListNode current = head;
    while (current != null) {
      list.add(current.val);
      current = current.next;
    }
    StringBuilder sb = new StringBuilder();
    for (int i : list) {
      sb.append(i);
    }
    String str = sb.toString();
    return str.contentEquals(sb.reverse());
  }

  private static boolean isPalindromeUsingMinAndReverse(ListNode head) {
    if (head == null || head.next == null) {
      return true;
    }

    // find min
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // reverse
    ListNode current = slow;
    ListNode previous = null;
    ListNode next = null;
    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    ListNode right = previous;
    ListNode left = head;
    while(right != null) {
      if (right.val != left.val) return false;

      left = left.next;
      right = right.next;
    }
    return true;
  }
}