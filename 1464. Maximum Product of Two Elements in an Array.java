class Solution 
{
    public int maxProduct(int[] nums) 
    {
     
    int n = nums.length;
    int max = 0;
    int ans = 0;
        
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
         ans = (nums[i]-1) * (nums[j]-1);
          
         if(ans > max)
       {
         max = ans;
       }
      }
    }
        return max;
    }
}