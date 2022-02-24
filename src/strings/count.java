package strings;
import java.util.*;
import java.util.Scanner;

public class count {
	public static void re(char[] c)
	{
		int characters = 0;
		int words = 1;
		int l = c.length;
		for(int i = 0; i<l;i++)
		{
			if(c[i]=='@' || c[i]=='!' || c[i]=='#' || c[i]=='$' || c[i]=='%' || c[i]=='^' || c[i]=='&' || c[i]=='*' || c[i]=='(' || c[i]==')')
				characters++;
			if(c[i]==' ')
				words++;
			
		}	
		if(words==1)
			words = 0;
		
		System.out.print("Words: "+words+" and characters: "+ characters);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		re(str.toCharArray());
		
		
		

}
}
