package JavaSessions;

public class IfElseConditionalOperator_Assignment2 {
	public static void main(String[] args)
	{
		//print the greatest number
		int a = 89;
		int b = 239;
		int c = 45;
		if(a>b && a>c)
		{
			System.out.println("a is max");
		}
		else if(b>c)
		{
			System.out.println("b is max");
		}
		else 
		{
			System.out.println("c is max");
		}
		
		//positive or negative number
		int a2 = 90;
		if(a2>0)
		{
			System.out.println("Positive number");
		}
		else if(a2<0)
		{
			System.out.println("Negative Number");
		}
		else 
		{
			System.out.println("Nutral");
		}
	}
}
