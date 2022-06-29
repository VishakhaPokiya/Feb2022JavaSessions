package JavaSessions;

import java.util.ArrayList;

public class AarryListConcept {

	public static void main(String[] args) {
		
		//ArrayList --- Default class
		//need to create the object of arrayList using new keyword
		//its maintain the order/index
		
		ArrayList a = new ArrayList();
		a.add(100);//0
		a.add(200);//1
		
		System.out.println(a.size());
		a.add(300);//2
		a.add(400);//3
		
		System.out.println(a.size());
		
		a.add(500);//4
		a.add(600);//5
		System.out.println(a.size());
		
		System.out.println(a.get(0));
		System.out.println(a.get(5));
		System.out.println(a.get(3));
		
//		System.out.println(a.get(6));//IndexOutOfBoundException
//		System.out.println(a.get(-1));//IndexOutOfBoundException
		
//		a.remove(4);
//		System.out.println(a.get(4));
//		System.out.println(a.size());
		
		
		for(int i = 0 ; i<a.size() ; i++)
		{
			System.out.println(a.get(i));
		}
		
		
		
	}

}
