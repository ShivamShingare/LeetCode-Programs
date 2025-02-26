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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode res = null;
        ListNode prev = null;
        int carry = 0;
        int sum = 0;

        if(l1 == null && l2 == null)
        {
            return null;
        }

        if(l1 == null && l2 != null)
        {
            return l2;
        }

        if(l2 == null && l1 != null)
        {
            return l1;
        }

        while(t1 != null && t2 != null)
        {
            sum = carry + t1.val + t2.val;
            carry = sum / 10;
            ListNode temp = new ListNode(sum%10);
            if(res == null)
            {
                res = temp;
                prev = res;
            }
            else
            {
                prev.next = temp;
                prev = prev.next;
            }
            t1 = t1.next;
            t2 = t2.next;
        }

        while(t1 != null)
        {
            sum = carry + t1.val;
            carry = sum/10;
             ListNode temp = new ListNode(sum%10);
            if(res == null)
            {
                res = temp;
                prev = res;
            }
            else
            {
                prev.next = temp;
                prev = prev.next;
            }
            t1 = t1.next;
        }

         while(t2 != null)
        {
            sum = carry + t2.val;
            carry = sum/10;
             ListNode temp = new ListNode(sum%10);
            if(res == null)
            {
                res = temp;
                prev = res;
            }
            else
            {
                prev.next = temp;
                prev = prev.next;
            }
            t2 = t2.next;
        }

        if(carry != 0)
        {
             ListNode temp = new ListNode(1);
            if(res == null)
            {
                res = temp;
                prev = res;
            }
            else
            {
                prev.next = temp;
                prev = prev.next;
            }
        }
        return res;
    }
}