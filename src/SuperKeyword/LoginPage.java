package SuperKeyword;

public class LoginPage extends Page{

	int timeOut = 200;
	
	//super is represents parent class object 
	public LoginPage()
	{
		super(10);
//		super(10,20);--->2 super statement is not allowed
		System.out.println("Lp...default const");
	}
	public void loginInfo()
	{
		
		System.out.println("Lp...loginInfo");
		super.display();//ParentClass
		display();//Child Class
	}
	@Override
	public void display()
	{
		System.out.println("Lp...display");
		super.display();
	}
	public void getTimeOut()
	{
		System.out.println("Lp...getTimeOut");
		System.out.println(super.timeOut);
		System.out.println(timeOut);
	}
}
