package JavaSessions;

public class MethodAssignment03 {

	public double circu(double r)
	{
		double c = 2 * 3.14 * r;
		return c;
	}
	public double area(double r)
	{
		double a = 3.14 * r * r;
		return a;
	}
	
	public static void main(String[] args) {
		
		MethodAssignment03 m = new MethodAssignment03();
		double c1 = m.circu(10);
		System.out.println("Circumference = " + c1);
		
		double a1 = m.area(10);
		System.out.println("Area = " + a1);
	}

}
