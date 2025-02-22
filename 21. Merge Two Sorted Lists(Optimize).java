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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode res;
        ListNode prev;

        if(list1 == null && list2 == null)
        {
            return null;
        }
        if(list1 == null && list2 != null)
        {
            return list2;
        }

        if(list2 == null && list1 != null)
        {
            return list1;
        }

        if(t1.val <= t2.val)
        {
            res = t1;
            prev = t1;
            t1 = t1.next;
        }
        else
        {
            res = t2;
            prev = t2;
            t2 = t2.next;
        }

        while(t1 != null && t2 != null)
        {
            if(t1.val <= t2.val)
            {
                if(prev == null)
                {
                    res = t1;
                    prev = t1;
                    t1 = t1.next;
                }
                else
                {
                    prev.next = t1;
                    t1 = t1.next;
                    prev = prev.next;
                }
            }
            else
            {
               if(prev == null)
                {
                    res = t2;
                    prev = t2;
                    t2 = t2.next;
                }
                else
                {
                    prev.next = t2;
                    t2 = t2.next;
                    prev = prev.next;
                } 
            }
        }
            if(t2 == null && t1 != null)
            {
                prev.next = t1;
            }
            else if(t1 == null && t2 != null)
            {
                prev.next = t2;
            }

        return res;
    }
}