class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
     
    int n = s.length();
    char ans[] = s.toCharArray();
        
    for(int j=0;j<n;j++)
    {
    char first = ans[0];
        
    for(int i=1;i<n;i++)
    {
      ans[i-1] = ans[i];
    }
    
    ans[n-1] = first;
        
    String res = "";
    for(int i=0;i<n;i++)
    {
       res += ans[i];
    }
    
    if(res.equals(goal))
    {
      return true;
    
    }
        
    }
        return false;
    
    }
}