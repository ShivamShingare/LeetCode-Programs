class Solution 
{
    public int heightChecker(int[] heights) 
  {
     
    int n = heights.length;
    int expected[] = new int[n];
    int expect = 0;
    int cnt = 0;
        
    for(int i=0;i<n;i++)
    {
      expect= heights[i];
      expected[i] = expect;
    }
    Arrays.sort(expected);
        
    for(int i=0;i<n;i++)
    {
      if(heights[i] != expected[i])
      {
        cnt++;
      }
    }
        return cnt;
  }
}