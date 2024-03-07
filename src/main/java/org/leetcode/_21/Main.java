package org.leetcode._21;

public class Main {
  public static void main(String[] args) {
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(3);
    ListNode a3 = new ListNode(5);

    a1.next = a2;
    a2.next = a3;

    ListNode b1 = new ListNode(2);
    ListNode b2 = new ListNode(3);
    ListNode b3 = new ListNode(4);

    b1.next = b2;
    b2.next = b3;

    ListNode result = ListNode.mergeTwoLists(a1, b1);
    System.out.println(result);

  }
}
