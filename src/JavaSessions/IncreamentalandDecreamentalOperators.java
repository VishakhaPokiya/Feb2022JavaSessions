package JavaSessions;

public class IncreamentalandDecreamentalOperators {
	public static void main(String[] args)
	{
		//post increment
		int a = 10;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		int a1 = -20;
		int b1 = a1++;
		System.out.println(a1);
		System.out.println(b1);
		
		int a2 = -1000;
		int b2 = a2++;
		System.out.println(a2);
		System.out.println(b2);
		
		//pre increment
		int a3 = 10;
		int b3 = ++a3;
		System.out.println(a3);
		System.out.println(b3);
		
		int a4 = -10;
		int b4 = ++a4;
		System.out.println(a4);
		System.out.println(b4);
		
		//post decrement
		int a5 = 100;
		int b5 = a5--;
		System.out.println(a5);
		System.out.println(b5);
		
		//pre decrement
		int a6 = 100;
		int b6 = --a6;
		System.out.println(a6);
		System.out.println(b6);
		
		int total = 100;
		System.out.println(total++);
		System.out.println(total);
		
		int balance = 999;
		System.out.println(++balance);
		
		char c = 'a';
		System.out.println(++c);
		
		
	}
}

