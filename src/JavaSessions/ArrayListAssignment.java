package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment{
	public static void main(String[] args)
	{
		//Que.1
				ArrayList c = new ArrayList();
				c.add("Red");
				c.add("Black");
				c.add("Brown");
				c.add("Pink");
				c.add("Blue");
				c.add("Green");
				for(int i = 0 ; i<c.size() ; i++)
				{
					System.out.println(c.get(i));
				}
				System.out.println("-------------------------------------");
				
				//Que.2
				
				c.add(0,"Purple");
				c.add(c.size(),"Orange");
				for(int i = 0 ; i<c.size() ; i++)
				{
					System.out.println(c.get(i));
				}
				System.out.println("---------------------------------------");
				
				//Que.3
				
				System.out.println(c.get(3));
				System.out.println(c.get(5));
				System.out.println("----------------------------------------");
				
				//Que.4
				c.add(2,"Murgantta");
				for(int i = 0 ; i<c.size() ; i++)
				{
					System.out.println(c.get(i));
				}
				System.out.println("---------------------------------------");
				
				
				//Que.5
				c.remove(3);
				for(int i = 0 ; i<c.size() ; i++)
				{
					System.out.println(c.get(i));
				}
				System.out.println("--------------------------------------");
				
				//Que.6
			    if(c.contains("Brown"))
			    {
			    	System.out.println("Brown is there");
			    }
			    else
			    {
			    	System.out.println("Brown is not there");
			    }
				System.out.println("----------------------------------------");
				
				
				
				//Que.7
				Collections.reverse(c);
				for(int i = 0 ; i<c.size() ; i++)
				{
					System.out.println(c.get(i));
				}
				System.out.println("------------------");
				
				
				ArrayList c1 = new ArrayList();
				c1.add("Vishu");
				c1.add("Ruhi");
				c1.add("Rohit");
				for(int i = c1.size()-1 ; i>=0 ; i--)
				{
					System.out.println(c1.get(i));
				}
				System.out.println("-----------------");
				
				
				Collections.reverse(c1);
				System.out.println(c1);
				System.out.println("-----------------------------------------");

				
				//Que.8
				   String s[] = {"Rohit","Vishu","Virohi","Ruhi"};
				   List<String> l1 = new ArrayList<String>(Arrays.asList(s));
				   for(int i = 1; i<=3 ; i++)
				   {
					   System.out.println(l1.get(i));
				   }
				System.out.println("-----------------------------------------");

				//Que.9		
				
				int a = 3;
				int b = 4;
				a = a+b;
				b = a-b;
				a = a-b;
				System.out.println("a = " + a);
				System.out.println("b = " + b);
				System.out.println("-----------------------");
				
			  ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(2,3,4));
			  Collections.swap(a1, 0, 2);
			  System.out.println(a1);
			  System.out.println("---------------------------------------------");
			   
			   //Que.10
//			   c.removeAll(c);		
//			   System.out.println(c);
			   
			   
			   //Que.11
			   c.trimToSize();
			   System.out.println(c);
			   System.out.println("---------------------------------------------");
			   
			   //Que.12
			   for(int i = 0 ; i<c.size(); i++)
			   {
				   System.out.println(i + "." + c.get(i));
			   }
			   
			   
			   
			   
			   
	}
}