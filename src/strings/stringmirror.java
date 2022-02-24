package strings;
import java.util.*;
public class stringmirror {

	static String reversal(String s1)
	{
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		String str = new String(sb);
		return str;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s+" | "+reversal(s));
		
		
	}
}
