class Solution 
{
    public int majorityElement(int[] nums) 
  {
     int n = nums.length;
     
    HashMap<Integer,Integer> hm = new HashMap<>();
        
        
    for(int i=0;i<nums.length;i++)
    {
      int ans = nums[i];
     hm.put(ans,hm.getOrDefault(ans,0)+1);
        
       if(hm.get(ans) > n/2 )
      {
       return ans;
      }
    }
        return -1;
  }
}