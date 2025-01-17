class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        int freq[] = new int[26];
		int freq1[] = new int[26];

		for(int i=0;i<s.length();i++)
		{
			int ascii_value = (int)s.charAt(i) - 97;
			freq[ascii_value]++;
		}

		for(int i=0;i<t.length();i++)
		{
			int ascii_value = (int)t.charAt(i) - 97;
			freq1[ascii_value]++;
		}

		for(int i=0;i<26;i++)
		{
			if(freq[i] != freq1[i])
			{
				return false;
			} 
		}
        return true;
    }
}