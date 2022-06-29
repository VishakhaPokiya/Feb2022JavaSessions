package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		
		int i[] = {10,20,30,40,50};//Array literals
		//System.out.println(i);
		System.out.println(Arrays.toString(i));
		
		ArrayList<String> lang = new ArrayList<String>(Arrays.asList("Java","Python","JS","Ruby"));
		System.out.println(lang);
		
		
		ArrayList<String> l = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("B","A","C","D","E"));
		
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);
		
		
		System.out.println(l.equals(l1));
		System.out.println(l.equals(l2));
		
		if(l.equals(l2))
		{
			System.out.println("Pass");
		}
		
		//web page-->drop down-->5List--->Actual List
		//Expected List--->5 elements
		
		
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		
		l3.removeAll(l4);
		System.out.println(l3);
		
		
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("Java","Python","JS","Ruby","Algo"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Java","Python","JS","Ruby","PHP"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);
		
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("F","J","H"));
		
		l5.addAll(l6);
		System.out.println(l5);
		
//		l6.clear();
//		System.out.println(l6);
		
		ArrayList<String> cloneList = (ArrayList<String>) l6.clone();
		System.out.println(cloneList);
		
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		l7.add(5, "F");
		System.out.println(l7);
		
//		l7.add(10, "G");		--->IndexOutOfBoundException
//		System.out.println(l7);
	
		
		
		
		
		
		
	}

}
