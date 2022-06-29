package MapConcept;

import java.util.HashMap;

public class LoginPage {

	public static String getUserCred(String role)
	{
		HashMap<String,String> credMap = new HashMap<String,String>();
		credMap.put("admin", "admin@az.com;admin123");
		credMap.put("Customer", "Customer@az.com;Customer123");
		credMap.put("Seller", "Seller@az.com;Seller123");
		credMap.put("Partner", "Partner@az.com;Partner123");
		credMap.put("Distributor", "Distributor@az.com;Distributor123");
		credMap.put("CatManager", "CatManager@az.com;CatManager123");
		
		return credMap.get(role);
	}
	public static void doLogin(String un, String pswd)
	{
		System.out.println("Login with : " + un + " : " + pswd);
	}
	public static void main(String[] args)
	{
		String cred[] = getUserCred("admin").split(";");
		String un = cred[0].trim();
		String pswd = cred[1].trim();
		doLogin(un,pswd);
	}
}
