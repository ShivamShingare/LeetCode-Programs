class Solution 
{
    public String removeDuplicates(String s) 
    {
       Stack<Character> st = new Stack<>();

        String t1 = "";

        for(int i=0;i<s.length();i++)
        {
            if(st.isEmpty())
            st.push(s.charAt(i));
            else if(st.peek() == s.charAt(i))
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        } 
        while(st.isEmpty() == false)
        {
            t1 += st.peek();
            st.pop();
        }

        String ans = "";
        for(int i=t1.length()-1;i>=0;i--)
        {
            ans += t1.charAt(i);
        }
        return ans;
    }
}