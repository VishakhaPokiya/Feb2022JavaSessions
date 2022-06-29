package JavaSessions;

public class FunctionsInJava {

	//can not create function inside the function
	//can call the function from other function
	
	//1.no input no return
	//void - no return
	public void test()
	{
		System.out.println("This is the test method");
		int a = 10;//local
		System.out.println(a);
	}
	public void getPrint()
	{
		System.out.println("get Print method");
	}
	
	//2.no input but some return
	public int getBalance()
	{
		int fee = 100;
		int tax = 50;
		int total = fee+tax;
		return total;
	}
	public String getName()
	{
		System.out.println("Get Name");
		String name = "Naveen";
		return name;
	}
	
	public boolean isEmpActive()
	{
		System.out.println("is Emp Active");
		return true;
	}
	
	//3.some input and some return
	public int add(int a,int b)
	{
		int c = a + b;
		return c;
	}
	
	public int getCourse(String courseName)
	{
		System.out.println("Youe course is = " + courseName);
		if(courseName.equals("API"))
		{
			return 50;
		}
		else if(courseName.equals("Selenium"))
		{
			return 100;
		}
		else if(courseName.equals("Mobile"))
		{
			return 70;
		}
		else 
		{
			return -1;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		FunctionsInJava f = new FunctionsInJava();
		f.test();
		f.getPrint();
		
		int b = f.getBalance();//----------------int b is known as holding parameter
		System.out.println(b);
		
		String n = f.getName();
		System.out.println("Trainer name is = " + n);
		
		boolean b1 = f.isEmpActive(); 
		System.out.println(b1);
		
		if(f.isEmpActive())
		{
			System.out.println("Pass");
		}
		
		int c = f.add(10, 20);
		System.out.println(c);
		
		int c1 = f.add(30, 40);
		System.out.println(c1);
		
		int fee = f.getCourse("Mobile");
		System.out.println("Course fee is = " + fee);
		
		if(fee==-1)
		{
			System.out.println("This is not part of the training");
		}
		
	}

}
