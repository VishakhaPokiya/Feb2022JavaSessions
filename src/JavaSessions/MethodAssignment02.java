package JavaSessions;

public class MethodAssignment02 {

	public int product(int a,int b)
	{
		int c = a*b;
		return c;
	}
	public static void main(String[] args) {
		
		MethodAssignment02 m = new MethodAssignment02();
		int c = m.product(10, 20);
		System.out.println(c);
	}

}
