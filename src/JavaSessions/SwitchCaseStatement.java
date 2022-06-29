package JavaSessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		String browser = " Firefox ";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "firefox":
			System.out.println("Launch Firefox");
			break;
		case "safari":
			System.out.println("Launch Safari");
			break;
		case "iE":
			System.out.println("Launch IE");
			break;
		default:
			System.out.println("Please,Enter the right browser...");
			break;
		}
		
		//switch-case for number
		int marks = 90;
		switch (marks) {
		case 100:
			System.out.println("A Grade");
			break;
		case 90:
			System.out.println("B Grade");
			break;
		default:
			System.out.println("Fail");
			break;
		}
		
		//switch-case is not applicable for boolean expression
		/*int num = 10;
		switch (num<=10) {
		case (10):
			System.out.println("Fail");
			break;

		default:
			break;
		}*/
		
		double d1 = 12.22;
		double d2 = 12.23;
		if(d1==d2)
		{
			System.out.println("Equal");
		}
		else 
		{
			System.out.println("Not Equal");
		}
		
		
		//reverse the condition
		boolean flag = true ;
		if(!flag)
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}

	}

}
