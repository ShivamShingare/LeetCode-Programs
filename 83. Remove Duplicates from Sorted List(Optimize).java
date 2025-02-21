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
class Solution 
{
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode t1 = head;
        ListNode res = head;
        ListNode prev = head;

        if(res == null)
        {
            return null;
        }
        
        while(t1 != null)
        {
            if(res == null)
            {
                res = t1;
                prev = t1;
            }
            else if(t1.val != prev.val)
            {
                prev.next = t1;
                prev = t1;
            }
            t1 = t1.next;
        }
        prev.next = null;
        return res;
    }
}