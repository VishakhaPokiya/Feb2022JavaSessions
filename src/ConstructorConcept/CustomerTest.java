package ConstructorConcept;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer c = new Customer("Peter" , 24 ,"Google");
		System.out.println(c.getName() + " " + c.getAge() + " " +  c.getComp());
		
		//update the value using setter
		c.setAge(26);
		System.out.println(c.getName() + " " + c.getAge() + " " +  c.getComp());
		
		c.setName("Mac");
		System.out.println(c.getName() + " " + c.getAge() + " " +  c.getComp());
		
		
		Customer c1 = new Customer();
		c1.setName("John");
		c1.setAge(25);
		c1.setComp("Amazon");
		System.out.println(c1.getName() + " " + c1.getAge() + " " + c1.getComp());
	}

}
