class Solution 
{
    public int prefixCount(String[] words, String pref) 
  {
      
    int cnt = 0;
    int n = words.length;
        
    for(int i=0;i<n;i++)
    {
      String s = words[i];
      int j = 0;
        
      for(j=0;j<pref.length();j++)
      {
        if(j>=s.length() || s.charAt(j) != pref.charAt(j) )
        {
          break;
        }
      }
        if(j == pref.length())
        {
          cnt++;
        }
    }
        return cnt;
  }
}