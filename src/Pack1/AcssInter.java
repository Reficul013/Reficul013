package Pack1;

public class AcssInter implements Inter{
	
	
	void print()
	{
		System.out.println("print method of AcssInter");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Interface method");
		
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

}
