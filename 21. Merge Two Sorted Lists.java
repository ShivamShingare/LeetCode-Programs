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
        
        List<Integer> arr = new ArrayList<>();
        ListNode t1 = list1;
        ListNode t2 = list2;

        while(t1 != null)
        {
            arr.add(t1.val);
            t1 = t1.next;
        }

        while(t2 != null)
        {
            arr.add(t2.val);
            t2 = t2.next;
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