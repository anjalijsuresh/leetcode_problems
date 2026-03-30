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
    public ListNode swapPairs(ListNode head) {
        ListNode initialHead=head;
        while(head!=null){
            if(head.next==null){
                head=head.next;
                break;
            }
            int prevVal=head.val;
            int nextVal=head.next.val;
            head.val=nextVal;
            head.next.val=prevVal;
            head=head.next;
            head=head.next;
        }
        head=initialHead;
        return head;
    }
}
