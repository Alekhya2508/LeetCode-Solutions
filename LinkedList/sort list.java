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
    public ListNode sortList(ListNode head) {
      
        if(head==null || head.next==null) return head;
        ListNode mid=middleNode(head);
        ListNode t=mid.next;
        mid.next=null;
        return merge(sortList(head),sortList(t));
    }
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                t.next=list1;
                t=list1;
                list1=list1.next;

            }else{
                 t.next=list2;
                t=list2;
                list2=list2.next;
            }
        }
        if(list1!=null){
            t.next=list1;
        }else{
            t.next=list2;
        }
        return dummy.next;
    }
    public ListNode middleNode(ListNode head) {
        ListNode s=head;
        ListNode f=head.next;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
      }
}