class Solution 
{
    public String mergeAlternately(String word1, String word2) 
  {
     
    int n = word1.length();
    int m = word2.length();
    String ans = "";
    
    int i = 0;
    int j = 0;
        
    for(;i<n && j<m;i++,j++)
    {
       ans += word1.charAt(i);
       ans += word2.charAt(j);
    }
        
    while(i<n)
    {
      ans += word1.charAt(i);
      i++;
    }
    
    while(j<m)
    {
      ans += word2.charAt(j);
      j++;
    }
    
     return ans;
  }
}