class Solution 
{
    public int calPoints(String[] operations) 
    {
        Stack<Integer> st = new Stack<>();

        for(String s : operations)
        {
            if(s.equals("+"))
            {
                int prev1 = st.pop();
                int prev2 = st.pop();
                int sum = prev1 + prev2;

                st.push(prev2);
                st.push(prev1);
                st.push(sum);
            }
            else if(s.equals("D"))
            {
                st.push(st.peek() * 2);
            }
            else if(s.equals("C"))
            {
                st.pop();
            }
            else
            {
                st.push(Integer.parseInt(s));
            }
        }

        int res = 0;
        while(st.isEmpty() == false)
        {
            res += st.peek();
            st.pop();
        }
        return res;
    }
}