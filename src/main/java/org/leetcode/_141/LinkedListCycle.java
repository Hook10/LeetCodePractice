package org.leetcode._141;


public class LinkedListCycle {
  public static void main(String[] args) {
    ListNode head = new ListNode(2);
    ListNode node1 = new ListNode(3);
    ListNode node2 = new ListNode(4);
    ListNode node3 = new ListNode(5);
    head.next = node1;
    node1.next = node2;
    node2.next= node3;
    node3.next = node1;
    System.out.println(hasCycle(head));
    node3.next = null;
    System.out.println(hasCycle(head));
  }

  private static boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) return false;

    ListNode slow = head;
    ListNode fast = head;

    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
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
