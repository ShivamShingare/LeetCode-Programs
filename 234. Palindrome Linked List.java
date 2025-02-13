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
    public boolean isPalindrome(ListNode head) 
    {
        
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        ListNode t;
        t = head;
        while(t != null)
        {
            arr.add(t.val);
            t = t.next;
        }

        for(int i=arr.size()-1;i>=0;i--)
        {
            arr1.add(arr.get(i));
        }

        if(arr.equals(arr1))
        {
            return true;
        }
        return false;
    }
}