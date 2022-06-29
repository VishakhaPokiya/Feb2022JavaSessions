package OOP_Abstract;

public class AmazonTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.title();//overridden method
		lp.url();//overridden method
		lp.header();//inherited method
		lp.doLogin("admin", "admin");//individual method
		System.out.println();
		
		HomePage hp = new HomePage();
		hp.title();
		hp.url();
		hp.header();
		hp.logOut();
		System.out.println();
		
		//top casting
		//child class object can be referred by parent abs...class ref variable
		Page p = new LoginPage();
		p.title();
		p.url();
		p.header();
		
		//down casting--CTnot allowed
		//LoginPage l = new Page();
	}

}
