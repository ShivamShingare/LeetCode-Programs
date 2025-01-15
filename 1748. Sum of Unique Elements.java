class Solution 
{
    public int sumOfUnique(int[] nums) 
    {
     int n = nums.length;
      int sum = 0; 
     int fre[] = new int[101];
        
    for(int i=0;i<n;i++)
    {
      fre[nums[i]]++;
    }
        
    for(int i=1;i<=100;i++)
    {
      if(fre[i] == 1)
      {
        sum += i;
      }
    }
        
        return sum;
  }
}