package Lamda;

import java.util.ArrayList;

interface SquareNumber{  
    int square(int num);  
}  

interface ConCat{
	String con(String s1, String s2);
}
interface GreaterThan50{
	ArrayList<Integer> grt(ArrayList<Integer> al);
}

public class lamdaExpression {

	
	    public static void main(String[] args) {  
	    	
	    	// Square of number
	    	SquareNumber sq = (int val) -> val * val;
	    	System.out.println(sq.square(5));
	    	
	    	
	    	// Concat 
	        ConCat c = (String s1 , String s2) -> s1.concat(s2);
	        System.out.println(c.con("String1 ", "String2"));
	        
	        
	        // ArrayList 
	        ArrayList<Integer> al = new ArrayList<>();
	        al.add(5);
	        al.add(20);
	        al.add(40);
	        al.add(70);
	        al.add(90);
	        al.add(120);
	        
	        GreaterThan50 gt = (ArrayList<Integer> a) -> 
	        {
	        	ArrayList<Integer> a2 =  new ArrayList<Integer>();
	        	for(int x:al)
	        	{
	        		if(x>50)
	        			a2.add(x);
	        	}
	        	return a2;
	        };
	        System.out.println(gt.grt(al).getClass().getName());
	        
}
}

