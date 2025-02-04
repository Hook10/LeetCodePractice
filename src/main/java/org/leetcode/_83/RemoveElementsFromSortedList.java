package org.leetcode._83;


public class RemoveElementsFromSortedList {
  public static void main(String[] args) {

  }

  private static ListNode deleteDuplicates(ListNode head) {
    if (head == null) return null;

    ListNode current = head;

    while (current != null && current.next != null) {
      if (current.val == current.next.val) {
        current.next = current.next.next;
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