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
    public ListNode deleteDuplicates(ListNode head) {
       SortedSet<Integer> s = new TreeSet<>();
        ListNode t;
        if(head == null)
        {
            return null;
        }
        t = head;
        while(t!=null)
        {
            s.add(t.val);
            t = t.next;
        }

        ListNode res = null;
        ListNode prev;
        prev = null;
        for(Integer val : s)
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