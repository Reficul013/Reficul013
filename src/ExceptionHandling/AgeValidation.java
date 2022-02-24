package ExceptionHandling;
import java.util.*;

public class AgeValidation {
	
	static int age;
	static String name;
	static Scanner sc = new Scanner(System.in);
	static void getName()
	{
		System.out.println("Name: ");
		name = sc.next();
		
	}
	static void getAge()
	{
		try {
			System.out.println("age: ");
			age = sc.nextInt();
			if(age < 15) 
			    throw new Exception();
			   
		}
		catch(Exception e)
		{
			System.out.println("The age should be more than 15. Please enter a proper age");
			getAge();
		}
	}
	
	static void getinfo()
	{
		
		getName();
		getAge();
		System.out.println("Person's name is "+name+" And his age is "+ age);

	}

	public static void main(String[] args)
	{
		
		System.out.println("Enter the name and age of the person");
		getinfo();
		
		
	}
	

}
