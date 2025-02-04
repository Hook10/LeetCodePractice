package org.leetcode._206;

public class ReverseLinkedList {
  public static void main(String[] args) {
    ListNode five = new ListNode(5, null);
    ListNode four = new ListNode(4, five);
    ListNode three = new ListNode(3, four);
    ListNode two = new ListNode(2, three);
    ListNode head = new ListNode(1, two);

    ListNode reversed = reverseList(head);
    System.out.println(reversed);


  }

  private static ListNode reverseList(ListNode head) {
    if (head == null) return null;

    ListNode current = head;
    ListNode next = null;
    ListNode previous = null;
    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    return previous;
  }
}

class ListNode {
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

  @Override
  public String toString() {
        return "\nval=" + val ;
  }
}
