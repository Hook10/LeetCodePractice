package org.leetcode._203;

public class RemoveLinkedListElements {
  public static void main(String[] args) {
 ListNode head = new ListNode(1);
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(3);
    ListNode node3 = new ListNode(6);
    ListNode node4 = new ListNode(5);
    ListNode node5 = new ListNode(6);
    head.next = node1;
    node1.next = node2;
    node2.next= node3;
    node3.next = node4;
    node4.next = node5;

    System.out.println(removeElements(head, 6));
  }

  private static ListNode  removeElements(ListNode head, int val) {
    while (head != null && head.val == val) {
      head = head.next;
    }

    if (head == null) return null;

    ListNode current = head;

    while (current.next != null) {
      if (current.next.val == val) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
    return head;
  }

}


 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

   @Override
   public String toString() {
     return "ListNode{" +
         "val=" + val +
         ", next=" + next +
         '}';
   }
 }
