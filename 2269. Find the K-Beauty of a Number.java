class Solution 
{
    public int divisorSubstrings(int num, int k) 
  {
     
    String s = Integer.toString(num);
    int cnt = 0;
    for(int i=0;i<s.length();i++)
    {
      int n = convert_int(s,i,k);
        
      if(n!=0 && (num%n == 0))
      {
        cnt++;
      }
    }
      return cnt;  
  }
    
  int convert_int(String num,int index,int k)
  {
    int n = 0;
    for(int i=index;i<num.length() && k>0;i++,k--)
    {
      int rem = num.charAt(i) - 48;
      n = n * 10 + rem;
    }
      if(k!=0)
          return 0;
      return n;
  }
}