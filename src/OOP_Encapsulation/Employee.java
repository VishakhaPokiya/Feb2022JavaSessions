package OOP_Encapsulation;

public class Employee {

	public static void main(String[] args) {
		
		Company c1 = new Company();
		c1.name = "MS";
		c1.hq = "HYB";
		
		c1.setSharePrice(1000);
		
		int c = c1.getSharePrice();
		System.out.println(c);

	}

}
