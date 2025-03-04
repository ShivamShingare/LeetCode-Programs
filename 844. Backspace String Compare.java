class Solution 
{
    public boolean backspaceCompare(String s, String t) 
    {
        Stack<Character> st = new Stack<>();

        String t1 = "";
        String t2 = "";

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '#')
            {
                if(st.isEmpty() == false)
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

        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i) == '#')
            {
                if(st.isEmpty() == false)
                st.pop();
            }
            else
            {
                st.push(t.charAt(i));
            }
        }
        while(st.isEmpty() == false)
        {
            t2 += st.peek();
            st.pop();
        }

        if(t1.equals(t2))
        {
            return true;
        }
        return false;
    }
}