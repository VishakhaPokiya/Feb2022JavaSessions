package JavaSessions;

public class StringConcat {
	public static void main(String[] args){
		
		String s = "Hello World";
		System.out.println(s);
		
		String s1 = "1000";
		System.out.println(s1);
		
		int a = 100;
		int b = 200;
		
		double d1 = 20.333;
		double d2 = 10.222;
		
		String x = "Hello";
		String y = "World";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(d1+d2);
		System.out.println(a+b+d1+d2);
		System.out.println(a+b+d1+d2+x+y);
		System.out.println(x+y+a+b+d1+d2);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(a+x+y+b);
		System.out.println(x+y+(a+b));
		
		System.out.println("The value of a is :" + a);
		System.out.println("The value of b is :" + b);
		System.out.println("The sum of a and b is :" + a+b);
		System.out.println("The sum of a and b is :" + (a+b));
		
		char c = 'a';//97
		char c1 = 'b';//98
		System.out.println(c+c1);//195
		System.out.println(c);//a
		System.out.println((int)c);//97 
		System.out.println(c*c1);
		System.out.println(c-c1);
		
		//ASCII range 
		//a-z = 97-122
		//A-Z = 65-90
		//0-9 = 48-57
		
		System.out.println(x+c);
		System.out.println(a+c);
		
		System.out.println(4/2);
		System.out.println(5/2);
		System.out.println(5.0/2);
		System.out.println(5.0/2.0);
		System.out.println(5/2.0);
		//System.out.println(10/0);//arithmatic Exception
		System.out.println(0/10);
		
		System.out.println(4%2);
		System.out.println(5%2);
		System.out.println(17%3);
		
//		System.out.println(0/0);//ArithmeticException
		System.out.println(0.0/0);//NaN-not a number
		System.out.println(0/0.0);//NaN-not a number
		System.out.println(0.0/0.0);//NaN
		System.out.println(5/0.0);//Infinity
		System.out.println(5.0/0.0);//Infinity
		
	}
}
