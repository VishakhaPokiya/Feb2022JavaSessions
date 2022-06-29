package JavaSessions;

public class Customers_static {
	
	//here  the 3 properties--->name,id,getInfo()
	String name;
	int id;
	static String city = "Canada";
	static String paymentMethod = "CC";
	
	public void getInfo()
	{
		System.out.println("get Information");
	}
	public static void sendMail()
	{
		System.out.println("Send mail");
	}
	
	
	public static void main(String[] args)
	{
		Customers_static c = new Customers_static();
		c.getInfo();
		
		//how to call static method:
		//1.call directly
		sendMail();
		
		//2.using class name
		Customers_static.sendMail();
		
		//3.using object ref
		c.sendMail();
	}

}
