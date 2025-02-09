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
    public ListNode removeElements(ListNode head, int val) 
    {
        
        List<Integer> arr = new ArrayList<>();
        ListNode t;
        t = head;

        if(head == null)
        {
            return null;
        }

        while(t != null)
        {
            arr.add(t.val);
            t = t.next;
        }

        Iterator<Integer> iter = arr.iterator();
        while(iter.hasNext())
        {
            if(iter.next() == val)
            {
                iter.remove();
            }
        }

        ListNode res = null;
        ListNode prev = null;
        for(int n : arr)
        {
            ListNode temp = new ListNode(n);
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