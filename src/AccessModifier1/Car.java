package AccessModifier1;

public class Car {
	
	String name;
	public String color;
	protected int price;
	private int licenseNumber;
	
	public static void main(String[] args)
	{
		Car c = new Car();
		c.name = "BMW";
		c.color = "Black";
		c.price = 1222212;
		c.licenseNumber = 323243;
		
		final int i = 10;
	}
}
