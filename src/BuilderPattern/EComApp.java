package BuilderPattern;

public class EComApp {
	
	public EComApp login()
	{
		System.out.println("default login...");
		return this;
	}
	public EComApp login(String un,String pswd)
	{
		System.out.println("Login with :" + un + " : " + pswd);
		return this;
	}
	public EComApp search(String productName)
	{
		System.out.println("Search for : " + productName);
		return this;
	}
	public EComApp search(String proctName,int rating)
	{
		System.out.println("search for : " + proctName + " : " + rating);
		return this;
	}
	public EComApp addtoCart(String productName)
	{
		System.out.println("Add to Cart : " + productName);
		return this;
	}
	public EComApp doPayment(String upi)
	{
		System.out.println("DoPayment : " + upi);
		return this;
	}
	public EComApp doPayment(String upi , String cvv)
	{
		System.out.println("DoPayment : " + upi + " : " + cvv);
		return this;
	}
	public EComApp doPayment(String cvv , String cc , int otp)
	{
		System.out.println("DoPayment : " + cvv + " : " + cc + " : " + otp);
		return this;
	}
	public EComApp genrateOrderId()
	{
		System.out.println("Order id is : " + 1234);
		return this;
	}
	public EComApp logout()
	{
		System.out.println("App logOut...");
		return this;
	}
}
