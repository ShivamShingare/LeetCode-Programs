class Solution 
{
    public int sumOfSquares(int[] nums) 
    {
     int n = nums.length;
     int sum = 0;
     int ans[] = new int[n];
        
    for(int i=0;i<n;i++)
   {
     if(n%(i+1)== 0)
     {
        ans[i] = nums[i];
     }
   }
        
    for(int i=0;i<ans.length;i++)
   {
        sum += ans[i] * ans[i];
   }
        return sum;
    }
}