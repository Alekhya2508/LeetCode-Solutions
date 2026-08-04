/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode h2=reverse(mid.next);
        mid.next=null;
        ListNode h1=head;
       while (h2 != null) {
        ListNode t1 = h1.next;
        ListNode t2 = h2.next;

         h1.next = h2;
         h2.next = t1;

         h1 = t1;
        h2 = t2;
       }
        
    }
    public ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head.next;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
     }
     public ListNode reverse(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}