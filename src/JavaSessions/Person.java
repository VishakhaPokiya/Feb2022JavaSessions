package JavaSessions;

public class Person {

	public void m1()
	{
		System.out.println("m1");
		m2();
		p1();
	}
	public void m2()
	{
		System.out.println("m2");
		m3();
	}
	public void m3()
	{
		System.out.println("m3");
	}
	
	public static void p1()
	{
		Person pp = new Person();	
		pp.m2();
		
		System.out.println("p1");
		p2();
		
	}
	public static void p2()
	{
		Person ppp = new Person();	
		ppp.m3();
		
		System.out.println("p1");
		p3();
	}
	public static void p3()
	{
		System.out.println("p1");
	}
	
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.m1();
		p.m2();
		
		Person.p1();
		Person.p2();

	}

}
