package org.leetcode._2;


public class Main {
  public static void main(String[] args) {
    ListNode a1 = new ListNode(9);
    ListNode a2 = new ListNode(9);
    ListNode a3 = new ListNode(9);
    ListNode a4 = new ListNode(9);
    ListNode a5 = new ListNode(9);
    ListNode a6 = new ListNode(9);
    ListNode a7 = new ListNode(9);

    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    a4.next = a5;
    a5.next = a6;
    a6.next = a7;

    ListNode b1 = new ListNode(9);
    ListNode b2 = new ListNode(9);
    ListNode b3 = new ListNode(9);
    ListNode b4 = new ListNode(9);

    b1.next = b2;
    b2.next = b3;
    b3.next = b4;

    ListNode listNode = ListNode.addTwoNumber(a1, b1);
    System.out.println(listNode);
  }

}
