package Pack1;
import java.util.*;
public class Employee extends Person{

	int empid;
	double salary;
	static int empstatic = 100;
	int b = 20;
//	
	Employee()
	{
		
	}
	
	Employee(int empid ,double salary)
	{
		this.empid = empid; 
		this.salary = salary;
	}
	static String printfun()
	{
		return "its a print funtion";
		
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}
	
	public Employee(int empid, double salary, String name, int age) {
		super(name, age);
		this.empid = empid;
		this.salary = salary;
		
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empid, double salary, String name, int age,Address address) {
		super(name, age, address);
		this.empid = empid;
		this.salary = salary;
	}
	int getid()
	{
		return this.empid;
	}
	double getSalary()
	{
		return this.salary;
	}

}
