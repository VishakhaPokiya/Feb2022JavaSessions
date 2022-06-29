package SelfPractice;

import java.util.HashMap;

public class Employee {
	
	public static void main(String[] args)
	{
		
		HashMap<String,Integer> emp = new HashMap<String,Integer>();
		
		emp.put("Vishu", 400);
		emp.put("Rohit", 300);
		emp.put(null, 100);
		emp.put("Savan", 500);
		emp.put("Darshna", 1000);
		emp.put(null, 800);
		
		emp.forEach((k,v) -> System.out.println(k + " : " + v));
		
		
	}
	
}
