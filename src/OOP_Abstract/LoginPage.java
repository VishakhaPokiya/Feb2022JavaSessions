package OOP_Abstract;

public class LoginPage extends Page{

//default constructor...hidden constructor...by java
	
	public LoginPage()
	{
		System.out.println("Lp---default constructor");
	}
	
	@Override
	public void title() {
		System.out.println("Lp---title");
	}

	@Override
	public void url() {
		System.out.println("Lp---url");
	}

	public void doLogin(String un,String pwd)
	{
		System.out.println("Login with : " + un + ":" + pwd);
	}
	
	public void doLogin(String un,String pwd, String ph)
	{
	System.out.println("Login with : " + un + ":" + pwd + ":" + ph);
	}
	
}
