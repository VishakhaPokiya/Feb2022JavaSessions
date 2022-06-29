package JavaSessions;

public class MethodOverLoadingECom {

	//method overloading:
	//within the same class,when you have number of methods:
	//1.with the same class 
	//2.different parameters
	//3.different types of parameters
	//4.sequence of the parameters should be different
	
	public void login()
	{
		System.out.println("Default parameter");
	}
	public void login(int pswd)
	{
		System.out.println("Login with : " + pswd);
	}
	public void login(String un,String pswd)
	{
		System.out.println("Login with :" + un + " and  " + pswd);
	}
	public void login(String un,int Otp)
	{
		System.out.println("Login with : " + un + " and " + Otp);
	}
	public void login(String un,String Otp,String pswd)
	{
		System.out.println("Login with : " + un + " and " + Otp + " and " + pswd);
	}
	public void login(long phno,int otp)
	{
		System.out.println("Login with : " + phno + " and " + otp);
	}
	
	//feature name : search
	//filters
	//1.name;
	//2.name,price
	//3.seller,name,price
	
	public void search()
	{
		
	}
	public void search(String name)
	{
		
	}
	public void search(String name,int price)
	{
		
	}
	
	//payment
	public void doPayment(String cc,int otp)
	{
		
	}
	public void doPayment(String debit,int otp,String pswd)
	{
		
	}
	public void doPayment(long pg,int otp)
	{
		
	}
	public void doPayment(long pg,int otp,String upi)
	{
		
	}
	
	//Uber
	//booking
	public void booking(String st,String end)
	{
		System.out.println(st);
		System.out.println(end);
	}
	public void booking(String st,String end,String carType)
	{
		
	}
	public void booking(String st,String end,String carType,String couponCode)
	{
		
	}
	
	public static void main(String[] args) {
		
		MethodOverLoadingECom m = new MethodOverLoadingECom();
		m.login();
		m.login(1203);
		m.login(787878877, 1203);
		m.login("Vishu","1203", "3112");
		m.login("Vishu", "1203");
		
		m.booking("Rachna", "Kapodra");
	}

}
