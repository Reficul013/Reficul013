package Array;
import java.util.*;
public class StringSort {
	public static void main(String[] args)
	{
	List<String> st = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Number of Strings");
	int n = sc.nextInt();
	for(int i=0;i<n;i++)
	{
		String str = sc.nextLine();
		st.add(str);
	}
	st.sort(null);
	for(String x : st)
		System.out.println(x);
	}
}
