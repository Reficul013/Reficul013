package Pack1;

public class Person {

	String name;
	int age;
	int b = 10;
	// HAS-A relationship
	Address address;
	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Person ()
	{
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	String getName()
	{
		return name;
	}
	int age()
	{
		return this.age;
	}
}
