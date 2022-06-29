package JavaSessions;

public class MethodAssignment04 {

	public int max(int a , int b , int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if(b>c)
		{
			return b;
		}
		else {
			return c;
		}
	}
	public int min(int a , int b , int c)
	{
		if(a<b && a<c)
		{
			return a;
		}
		else if(b<c)
		{
			return b;
		}
		else {
			return c;
		}
	}
	public static void main(String[] args) {
		
		MethodAssignment04 m = new MethodAssignment04();
		int d = m.max(100, 49, 15);
		System.out.println("Max number is : " + d);
		
		int e = m.min(2, 100, 22);
		System.out.println("Min number is : " + e);

	}

}
