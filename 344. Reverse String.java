class Solution 
{
    public void reverseString(char[] s) 
    {
        char ans[] = new char[s.length];
        char t = '\u0000';

        for(int i=s.length-1,j=0;i>=0;i--,j++)
        {
            t = s[i];
            ans[j] = t;
        }

        for(int i=0;i<s.length;i++)
        {
            s[i] = ans[i];
        }
    }
}