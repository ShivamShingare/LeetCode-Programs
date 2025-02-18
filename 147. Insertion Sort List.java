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
    public ListNode insertionSortList(ListNode head) 
    {
        List<Integer> arr = new ArrayList<>();
        if(head == null)
        {
            return null;
        }
        ListNode t;
        t = head;
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