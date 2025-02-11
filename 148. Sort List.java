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
    public ListNode sortList(ListNode head) 
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

        Collections.sort(arr);

        ListNode res = null;
        ListNode prev = null;
        for(int val : arr)
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