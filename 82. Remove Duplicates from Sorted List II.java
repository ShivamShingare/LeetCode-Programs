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
        List<Integer> arr = new ArrayList<>();
        ListNode t;
        t = head;

        while(t != null)
        {
            arr.add(t.val);
            t = t.next;
        }

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.size();i++)
        {
            int ans = arr.get(i);
            hm.put(ans,hm.getOrDefault(ans,0)+1);
        }

        ListNode res = null;
        ListNode prev = null;
        for(int val : arr)
        {
            if(hm.get(val) == 1)
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
                    prev = temp;
                }
            }
        }
        return res;
    }
}