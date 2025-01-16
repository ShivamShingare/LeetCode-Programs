class Solution 
{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        int n = word1.length;
        int m = word2.length;
        String ans1 = "";
        String ans2 = "";

        

        for(int i=0;i<n;i++)
        {
            ans1 += word1[i];
        }

        for(int i=0;i<m;i++)
        {
            ans2 += word2[i];
        }
      
      if(ans1.length() != ans2.length())
        {
            return false;
        }
      
        for(int i=0;i<ans1.length();i++)
        {
                if(ans1.charAt(i) != ans2.charAt(i))
                {
                    return false;
                }
        }
        return true;
    }
}