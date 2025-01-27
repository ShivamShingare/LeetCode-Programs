class Solution 
{
    public int findNumbers(int[] nums) 
  {
    int n = nums.length;
    int cnt = 0;
    int dcnt = 0;   
    for(int i=0;i<n;i++)
    {
      int num = nums[i];
        
      String s = Integer.toString(num);
      dcnt = s.length();
        System.out.println(dcnt);
        if(dcnt%2 == 0)
        {
          cnt++;
        }
    }
     return cnt;
  }
}