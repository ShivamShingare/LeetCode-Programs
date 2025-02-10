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
    public ListNode reverseList(ListNode head) 
    {
        ListNode t;
        List<Integer> arr = new ArrayList<>();
        if(head == null)
        {
            return null;
        }
        t = head;
        while(t != null)
        {
            arr.add(t.val);
            t = t.next;
        }

        Collections.reverse(arr);
        
        ListNode res = null;
        ListNode prev = null;
        for(Integer val : arr)
        {
            ListNode temp = new ListNode(val);
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