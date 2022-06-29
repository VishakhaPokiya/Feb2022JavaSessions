package OOP_Encapsulation;

public class AmazonLoginPage {

	private String userName;
	private String password;
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getUserName()
	{
		return userName;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword() 
	{
		return password;
	}
	public void logIn(String userName,String password)
	{
		System.out.println(userName + " " + password);
	}
	public static void main(String[] args) {
		

	}

}
