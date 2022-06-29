package JavaSessions;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		//here Integer is a class and non primitive data type
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		
		//here a is called local variable
//		for(Integer a : ar)
//		{
//			System.out.println(a);
//		}
		
		for(int i = 0 ; i<ar.size() ; i++)
		{
			System.out.println(ar.get(i));
		}
		
		
		//Double AL
		ArrayList<Double> ar1 = new ArrayList<Double>();
		ar1.add(10.23);
		ar1.add(20.39);
		ar1.add(30.89);
		ar1.add(40.43);
		
//		for(Double d : ar1)
//		{
//			System.out.println(d);
//		}
		
		for(int i = 0 ; i<ar1.size() ; i++)
		{
			System.out.println(ar1.get(i));
		}
		
		
		//String AL
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Java");
		ar2.add("Python");
		ar2.add("JS");
		ar2.add("Ruby");
		
//		for(String s : ar2)
//		{
//			System.out.println(s);
//		}
		
		for(int i = 0 ; i<ar2.size() ; i++)
		{
			System.out.println(ar2.get(i));
		}
		
		
		//Object AL
		ArrayList<Object> ar3 = new ArrayList<Object>();
		ar3.add("Vishu");
		ar3.add(10);
		ar3.add(12.99);
		ar3.add('&');
		ar3.add(true);
//		for(Object o : ar3)
//		{
//			System.out.println(o);
//		}
		for(int i = 0 ; i<ar3.size() ; i++)
		{
			System.out.println(ar3.get(i));
		}
		
	}

}
