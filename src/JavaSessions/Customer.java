package JavaSessions;

import java.util.ArrayList;

public class Customer {

	public ArrayList<String> customer(String productName)
	{
		System.out.println("Searcing product name : " + productName);
		ArrayList<String> a = new ArrayList<String>();
		switch(productName)
		{
		case "Apple":
			a.add("Macbook");
			a.add("Iphone 13");
			a.add("Tablet");
			break;
		case "Samsung":
			a.add("Mobile");
			a.add("Tablet");
			a.add("Washing Machine");
			break;
		case "Hp":
			a.add("Laptop");
			a.add("Assasories");
			break;
		default :
			System.out.println("Product is not found");
			break;
		}
		return a;
		
	}
		//WAF-launch the browser(Cross Browser logic)
		//input parameter-browserName(String)
		//return - void
		
	
	public void launchBrowser(String browserName)
	{
		System.out.println("Browser Name :" + browserName);
		if(browserName.equals("Chrome"))
		{
			System.out.println("Launch Chrome");
		}
		else if(browserName.equals("firefox"))
		{
			System.out.println("launch fire fox");
		}
		else if(browserName.equals("safari"))
		{
			System.out.println("launch safari");
		}
		else 
		{
			System.out.println("Please Enter the right browser");
		}
	}
	
	//WAF--register a user
	//parameters -- name,email,password,city,age,address,country,pin
	//we will pass the class object
	//Limit -->maximum we can pass 255 parameter
	//but java says you can pass only 5 parameter
	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		ArrayList<String> a = c.customer("Apple");
		System.out.println(a.size());
		System.out.println(a); 
		
		for(String a1 : a)
		{
			System.out.println(a1);
		}

		
		ArrayList<String> s = c.customer("Samsung");
		System.out.println(s.size());
		System.out.println(s);
		
		for(String s1 : s)
		{
			System.out.println(s1);
		}

		
		ArrayList<String> h = c.customer("Nokia");
		System.out.println(h.size());
		System.out.println(h);
		
		
		
		c.launchBrowser("safari");
		
	}

}
