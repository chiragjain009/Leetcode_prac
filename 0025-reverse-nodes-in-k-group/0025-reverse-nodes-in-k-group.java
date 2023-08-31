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
    public ListNode reverseKGroup(ListNode head, int k) {
        

        ListNode curr=head;
        ListNode prevTailPair=new ListNode(-1);
        ListNode nextHeadPair=null;

        while(curr!=null){
            
            prevTailPair.next=curr;
            int count=k-1;
            while(curr!=null && count!=0){
                curr=curr.next;count--;
            }
            if(count!=0 || curr==null)break;
            nextHeadPair=curr.next;
            curr.next=null;

           
            //now rev the k nodes
            ListNode reverseHead=reverseList(prevTailPair.next);
            prevTailPair.next.next=nextHeadPair;
            ListNode temp=prevTailPair.next;
            prevTailPair.next=reverseHead;
            
            //assign head
            if(prevTailPair.val==-1)head=prevTailPair.next;

            prevTailPair=temp;
            curr=nextHeadPair;


        }
        return head;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}