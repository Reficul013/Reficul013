package Pack1;
import java.util.*;

public class inc {
	public static void main(String[] args)
	{

Scanner sc = new Scanner(System.in);
int n;
n=sc.nextInt();
int l=n%10;
n=n/10;
int flag=0;
while(n>0)
{
	
	if(l<=n%10)
	{
		flag = 1;
		break;
	}
	l=n%10;
	n=n/10;
}
if(flag==1)
	System.out.print("not a increasing number");
else
	System.out.print("increasing number");
}
}