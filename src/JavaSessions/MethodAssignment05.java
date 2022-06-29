package JavaSessions;

public class MethodAssignment05 {

	public void oddEven(int a)
	{
		if(a%2==0)
		{
			System.out.println("Even Number");
		}
		else 
		{
			System.out.println("Odd Number");
		}
	}
	public static void main(String[] args) {
		
		MethodAssignment05 m = new MethodAssignment05();
		m.oddEven(8);
		m.oddEven(10);
		m.oddEven(11);
		m.oddEven(27);
	}

}
