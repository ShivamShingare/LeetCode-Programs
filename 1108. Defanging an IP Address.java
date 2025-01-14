class Solution 
{
    public String defangIPaddr(String address) 
    {
     
    int n = address.length();
    String ans = "";
        
    for(int i=0;i<n;i++)
    {
      if(address.charAt(i) == '.')
      {
        ans += "[.]";
      }
      else
      {
         ans += address.charAt(i);
      }
    }
        return ans;
    }
}