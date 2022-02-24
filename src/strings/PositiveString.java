package strings;
import java.util.*;
public class PositiveString {
	static boolean checker(char[] chr)
	{
		int l = chr.length;
		for(int i=0;i<l-1;i++)
		{
			int pre = (int)chr[i];
			int nxt = (int)chr[i+1];
			//System.out.println(nxt+" "+pre);
			if(nxt<pre)
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ANT";
		if(checker(str.toCharArray()))
			System.out.println("Positive String");
		else
			System.out.println("Negative String");
		
		
	}

}
