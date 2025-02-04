package org.leetcode._876;

public class MidOfLinkedList {
  public static void main(String[] args) {

  }

  private static ListNode middleNode(ListNode head) {
    if(head == null) return null;

    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}
