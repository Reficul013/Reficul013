package ExceptionHandling;
import java.util.*;

public class NameValidation {
static String firstName;
static String lastName;
static Scanner sc = new Scanner(System.in);

static void getFirstName()
{
	try
	{
	System.out.println("Please enter the first name");	
	firstName = sc.nextLine();
	if(firstName.isEmpty())
		throw new Exception();
	}
	catch(Exception e) 
	{
		System.out.println("Name can not be blank. Please enter a proper name");
		getFirstName();
	}		
}

static void getLastName()
{
	try
	{
	System.out.println("Please enter the last name");	
	lastName = sc.nextLine();
	if(lastName.isEmpty())
		throw new Exception();
	}
	catch(Exception e) 
	{
		System.out.println("Name can not be blank. Please enter a proper name");
		getLastName();
	}
}
static void getName() {
	getFirstName();
	getLastName();
	System.out.println("The name is: "+ firstName +" "+lastName);
}
public static void main(String[] arg)
{
	getName();
}

}
