class Solution 
{
    public boolean areOccurrencesEqual(String s) 
    {
        
        int freq[] = new int[26];

        for(int i=0;i<s.length();i++)
        {
            int ascii_value = (int) s.charAt(i) - 97;
            freq[ascii_value]++;
        }

        for(int i=1;i<s.length();i++)
        {
            int ascii_curr_value = (int)s.charAt(i) - 97;
            int ascii_prev_value = (int)s.charAt(i-1) - 97;

            if(freq[ascii_curr_value] != freq[ascii_prev_value])
                return false;
        }
        return true;
    }
}