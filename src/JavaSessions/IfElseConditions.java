package JavaSessions;

public class IfElseConditions {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("b is greater than a");
		}
		
		if(a==b)
		{
			System.out.println("Both are equal");
		}
		
		
		/*dead code:Here the else part is called as dead code bcoz java compiler is not able to reach there bcoz
		before that condition is satisfied so it could never enter in else part so this else is become a dead 
		code so it is not right method to right the code*/
		if(true)
		{
			System.out.println("Hey");
		}
		else
		{
			System.out.println("Bye");
		}
		
		
		boolean t = true;
		if(t) {
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		//Nested if
		int marks = 101;
		if(marks<=100)
		{
			if(marks>=90)
			{
				System.out.println("A Grade");
			}
			if(marks>=80)
			{
				System.out.println("B Grade");
			}
		}
		else 
		{
			System.out.println("Invalid marks");
		}
		
		
		/*String browser = "Chrome";
		if(browser.equals("Chrome"))
		{
			System.out.println("launch chrome");
		}
		if(browser.equals("Safari"))
		{
			System.out.println("launch Safari");
		}
		if(browser.equals("Firefox"))
		{
			System.out.println("launch firefox");
		}
		else
		{
			System.out.println("Plzz enter the right browser....");
		}*/
		
		String browser = "Chrome";
		if(browser.equals("Chrome"))
		{
			System.out.println("Launch Chrome");
		}
		else if(browser.equals("Safari"))
		{
			System.out.println("Launch Safari");
		}
		else if(browser.equals("Firefox"))
		{
			System.out.println("Launch Firefox");
		}
		else
		{
			System.out.println("Plzz enter the right browser...");
		}
		
		
		/*int x = 1000;
		int y = 2000;
		int z = 300;
		if(x>y && x>z)
		{
			System.out.println("x is max");
		}
		else if(y>z)
		{
			System.out.println("y is max");
		}
		else
		{
			System.out.println("z is max");
		}*/
		
		
		int a1 = 1000;
		int a2 = 200;
		int a3 = 300;
		int a4 = 400;
		if(a1>a2 && a1>a3 && a1>a4)
		{
			System.out.println("a1 is max");
		}
		else if(a2>a3 && a2>a4)
		{
			System.out.println("a2 is max");
		}
		else if(a3>a4)
		{
			System.out.println("a3 is max");
		}
		else
		{
			System.out.println("a4 is max");
		}

			
			
			
			
			
			
			
			
	}

}
