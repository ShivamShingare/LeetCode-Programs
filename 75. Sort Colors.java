class Solution 
{
    public void sortColors(int[] nums) 
    {
      Arrays.sort(nums);

      ListNode res = null;
      ListNode prev = null;
      for(int val : nums)
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
    }
}