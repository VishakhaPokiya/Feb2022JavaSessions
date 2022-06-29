package OOP_Encapsulation;

public class AmazonTest {

	public static void main(String[] args) {
		
		AmazonLoginPage lp = new AmazonLoginPage();
		
		lp.setUserName("Admin@gmail.com");
		lp.setPassword("admin@123");
		lp.logIn(lp.getUserName(),lp.getPassword() );
		
		lp.setPassword("admin@456");
		lp.logIn(lp.getUserName(),lp.getPassword() );
		
		AmazonLoginPage lp1 = new AmazonLoginPage();
		lp1.logIn(lp1.getUserName(),lp1.getPassword() );
		
		lp1.setUserName("Kinu@gmail.com");
		lp1.setPassword("Kinu@123");
		lp1.logIn(lp1.getUserName(),lp1.getPassword() );
	}

}
