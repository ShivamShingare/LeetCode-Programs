class Solution 
{
    public int uniqueMorseRepresentations(String[] words) 
    {
        String code[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            String word = words[i];
            String ans = "";

            for(char ch : word.toCharArray())
            {
                ans += code[ch - 'a'];
            }
            hm.put(ans,hm.getOrDefault(ans,0)+1);
        }
        return hm.size();
    }
}