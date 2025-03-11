import java.util.*;

public class Last
{
	public static int find(String s)
	{
		int cnt = 0;
		int n = s.length();
		for(int i= n-1;i>=0;i--)
		{
			if(s.charAt(i) == ' ')
			{
				if(cnt != 0)
				{
					break;
				}
			}

			if(s.charAt(i) != ' ')
			{
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String args[])
	{
		String s = "Shivam Yogesh Shingare";

		int ans = find(s);
		System.out.println(ans);
	}
}