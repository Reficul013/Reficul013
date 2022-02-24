package strings;
import java.util.*;
public class Stringtoken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sum = 0;
		StringTokenizer stoken = new StringTokenizer(str);
		while(stoken.hasMoreElements())
		{
			String stt = stoken.nextToken();
			System.out.println(stt);
			int newnum = Integer.parseInt(stt);
			sum += newnum;
		}
		System.out.println("Sum of all number: "+ sum);
	}

}
