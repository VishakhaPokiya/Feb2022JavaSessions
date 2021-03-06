package MapConcept;

import java.util.HashMap;

public class Employee {
	public static void main(String[] args)
	{
		//Map(I)<--hashMap(C);
		
		HashMap<String,String> empMap = new HashMap<String,String>();
		empMap.put("A", "Peter");
		empMap.put("B", "Tom");
		empMap.put("C", "Robert");
		
		System.out.println(empMap.get("A"));
		
		HashMap<String,Integer> studentMap = new HashMap<String,Integer>();
		studentMap.put("Tom", 100);
		studentMap.put("Peter", 200);
		studentMap.put("Peter", 300);
		studentMap.put("Naveen", 300);
		studentMap.put(null, 300);
		studentMap.put(null, 500);
		
		System.out.println("-----------");
		studentMap.forEach((k,v)-> System.out.println(k + ":" + v));
		System.out.println("------------");
		
		System.out.println(studentMap.get("Peter"));
		System.out.println(studentMap.get(null));
		
		HashMap<Integer,Integer> m1 = new HashMap<Integer,Integer>();
		m1.put(1, 100);
		m1.put(2, 200);
		System.out.println(m1.get(1));
	}
}
