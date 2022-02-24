package Pack1;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set s = new HashSet();
//		s.add(23);
//		s.add("aloo");
//		System.out.println(s);
//		Set<String> s1 = new HashSet<>();
//		
		
		System.out.println(Employee.empstatic);
		System.out.println(Employee.printfun()); // does not take a void function
		Person p = new Person(); // reference and object both parent
		
		Employee emp = new Employee(); // reference and object both parent {can access both parent and child class data member}
		
		Person p1 = new Employee(); // reference is parent and object is child 
		System.out.println(p1.b);
		
		// @ function overriding is achieved 
		Employee emp1 = new Employee(123,20000,"ram",20);
		System.out.println(emp1);
		
		
		//System.out.println(emp.address.address);
		
		Address ad = new Address();
		ad.address = "10-20";
		Employee emp2 = new Employee(123,20000,"ram",20,ad);
		//System.out.println(emp.);
		
		// accessing abstract methods
		AcssAbs abb = new AcssAbs();
		abb.th();
		abb.m1();
		
		// accessing Interface methods
		// reference is class and object is the same
		AcssInter inter = new AcssInter();
				
		System.out.println(inter.add(122, 22));
		inter.m1();
		
		// reference is interface and object is class
		Inter in = new AcssInter();
		in.m1();

		
	}

}
