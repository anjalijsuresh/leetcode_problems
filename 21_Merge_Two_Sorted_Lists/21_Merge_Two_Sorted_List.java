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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode save =new ListNode();
        save.next=new ListNode();
        ListNode head =save;
        if (list1==null && list2==null)
            return (list1);
        while(list1!=null || list2!=null){
            save=save.next;
            ListNode nextNode =new ListNode();
            if(list1!=null && list2!=null){
                if(list1.val>=list2.val){
                    save.val=list2.val;
                    list2=list2.next;
                }
                else if(list1.val<=list2.val){
                    save.val=list1.val;
                    list1=list1.next;
                }
            }
            else{
                if(list1!=null){
                    save.val=list1.val;
                    list1=list1.next;
                }
                else if(list2!=null){
                    save.val=list2.val;
                    list2=list2.next;
                }
            }
            //System.out.println(save.val);
            save.next=nextNode;
        }
        save.next=null;
        save=head.next;
        return(save);
    }
}
