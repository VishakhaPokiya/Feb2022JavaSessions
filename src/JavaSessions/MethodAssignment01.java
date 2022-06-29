package JavaSessions;

public class MethodAssignment01 {

	public int sum()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}
	public static void main(String[] args) {
		
		MethodAssignment01 m = new MethodAssignment01();
		int d = m.sum();
		System.out.println(d);
	}

}
