package JavaSessions;

public class ArrayConcept {
	public static void main(String[] args)
	{
		//two major limitations:
		//1.size of the array is always fixed[static array]:TO OVERCOME THIS PROBLEM-->use Dynamic array-->ArraList
		//2.similar type of data:TO OVERCOME THIS PROBLEM-->use Dynamic array-->ArraList/static Object Array
		
		//use cases
		//static data
		//days 31/months 12
		
		
		//1.int array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[2]);
		//System.out.println(i[4]);//ArrayIndexOutOfBound exception
		//System.out.println(i[-1]);//ArrayIndexOutOfBound exception
		
//		System.out.println(i[0]+i[1]);
		
		int len = i.length;
		System.out.println("Length = "+ len);
		System.out.println("Highest Index = "+ (len-1));
		System.out.println("Lowest Index = " + 0);
		
		//print all the values from array : for loop
		
//		for(int k = 0 ; k<len ; k++) {
//			System.out.println(i[k]);
//		}
		
//		for(int k = 0 ; k<i.length; k++) {
//			System.out.println(i[k]);
//		}

//		for(int k = 0 ; k<=len-1 ; k++)
//		{
//			System.out.println(i[k]);
//		}
		
		//for each loop:enhanced for loop
		for(int e:i)
		{
			System.out.println(e);
		}
		System.out.println("------------------------------------------------------");
		
		
		
		//2.double array
	
		double d[] = new double[3];
		d[0] = 12.99;
		d[1] = 10;
		d[2] = 20.676;
//		d[3] = 25.33;
//		System.out.println(d[3]);//ArrayIndexOutOfBound exception
		
		for(int y = 0 ; y<d.length ; y++)
		{
			System.out.println(d[y]);
		}
		
		int y = 0;
		for(double d1 : d)
		{
			System.out.println(y + "." + d1);
			y++;
		}
		System.out.println("-------------------------------------------------------");
		
		
		
		//3.char array
		char c[] = new char[4];
		c[0] = 'w';
		c[1] = '&';
		c[2] = '1';
		for(char c1 : c)
		{
			System.out.println(c1);
		}
		System.out.println("------------------------------------------------------");
		
		
		
	//4.String Array
		String s[] = new String[4];
		s[0] = "Java";
		s[1] = "Python";
		s[2] = "JS";
		s[3] = "Ruby";
		
		System.out.println(s[0] + s[1]);//concatination
		
		for(int x = 0 ; x<s.length ; x++)
		{
			System.out.println(x + "." + s[x]);
		}
		
		int x= 0;
		for(String s1 : s)
		{
			System.out.println(x + "." + s1);
			x++;
		}
		System.out.println("----------------------------------------------------");
		
		
		//Object Array
		Object o[] = new Object[4];
		o[0] = "Vishu";
		o[1] = 10.989;
		o[2] = 'r';
		o[3] = 56;
		for(Object o1 : o)
		{
			System.out.println(o1);
		}
		
		
		//Interview question
		String s1[] = new String[100];
		s[0] = "MacBook Air";
		s[1] = "MacBook pro"; 
				
	
	}
}
