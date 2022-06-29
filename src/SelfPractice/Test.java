package SelfPractice;

import java.util.HashMap;

public  class Test {
	
	public static void main(String[] args)
	{
		HashMap<String,Integer> emp = new HashMap<String,Integer>();
		
		emp.put("Vishu",600);
		emp.put("Miral",300);
		emp.put("Rohit",200);
		emp.put(null,700);
		emp.put("Avani",700);
		emp.put("Naksh",800);
		emp.put(null,100);
		emp.put("Virohi",400);
		
		emp.forEach((k,v)-> System.out.println(k + ":" + v));
		
	}
}
