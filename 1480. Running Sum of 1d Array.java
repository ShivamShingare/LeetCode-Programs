class Solution 
{
    public int[] runningSum(int[] nums) 
    {
        int runningSum[] = new int[nums.length];
        int running = 0;
      for(int i=0;i<nums.length;i++)
     {
       running += nums[i];
       runningSum[i]= running;
       
     }
        return runningSum;
    }
}