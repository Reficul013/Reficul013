package strings;
import java.util.*;
public class constant {
	static boolean isVowel(char ch)
	{
		if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u')
			return true;
		return false;
		
	}
	
static String replaceconstant (char[] s)
{
	int l = s.length;
	for(int i=0;i<l;i++)
	{
		if(isVowel(s[i]))
		{
			//System.out.println("hello");
			continue;	
		}
		if(s[i]=='z')
		{
			s[i] = 'b';
			continue;
		}
		else
		{
			
			s[i] = (char)(s[i]+1);
		}
	}
	
	
	//String sr = s.toString();
	return String.valueOf(s);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(replaceconstant(str.toCharArray()));
		
		 
	}

}
