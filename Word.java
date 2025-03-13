import java.util.*;

public class Word
{
	public static String find(String s,int k)
	{
		int cnt = 0;
		String res = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				cnt += 1;
				System.out.println(cnt);
			}

			if(cnt == k)
				break;
			res += s.charAt(i);
		}
		return res;
	}
	public static void main(String args[])
	{
		String s = "Hello how are you";
		int k = 3;

		String ans = find(s,k);
		System.out.print(ans);
		
	}
}