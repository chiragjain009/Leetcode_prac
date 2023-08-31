/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)return false; 
        ListNode slowRunner=head;
        ListNode fastRunner=head;
        while(slowRunner!=null &&  fastRunner!=null && fastRunner.next!=null){
            slowRunner=slowRunner.next;
            fastRunner=fastRunner.next.next;
            if(slowRunner==fastRunner)return true;
        }

        return false;

    }
}