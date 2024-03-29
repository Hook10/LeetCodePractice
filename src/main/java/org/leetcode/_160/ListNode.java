package org.leetcode._160;

public class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }

  public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == headB) return headA;
    if (headA == null || headB == null) return null;

    ListNode aPointer = headA;
    ListNode bPointer = headB;

    while (aPointer != bPointer) {
      if (aPointer == null) {
        aPointer = headB;
      } else {
        aPointer = aPointer.next;
      }

      if (bPointer == null) {
        bPointer = headA;
      } else {
        bPointer = bPointer.next;
      }
    }
    return aPointer;

  }

  public static void main(String[] args) {
    ListNode a1 = new ListNode(4);
    ListNode a2 = new ListNode(1);

    ListNode b1 = new ListNode(5);
    ListNode b2 = new ListNode(6);
    ListNode b3 = new ListNode(1);

    ListNode c1 = new ListNode(8);
    ListNode c2 = new ListNode(4);
    ListNode c3 = new ListNode(5);

    a1.next = a2;
    a2.next = c1;

    b1.next = b2;
    b2.next = b3;
    b3.next = c1;

    c1.next = c2;
    c2.next = c3;
    System.out.println(getIntersectionNode(a1, b1));

  }

  @Override
  public String toString() {
    return "ListNode{" +
        "val=" + val +
        ", next=" + next +
        '}';
  }
}
