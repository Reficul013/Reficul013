package Array;
import java.util.*;
public class SecondSmallest {

	static int getSecondSmallest(int[] a,int n)
	{
		Arrays.sort(a);
		return a[1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n; // number of elements
		n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
		System.out.println(getSecondSmallest(a,n));

	}

}
