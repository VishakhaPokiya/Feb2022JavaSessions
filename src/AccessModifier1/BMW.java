package AccessModifier1;

public class BMW extends Car{

	public static void main(String[] args) {
		
		Car c = new Car();
		c.name = "BMW520";
		c.color = "Red";
		c.price = 7647839;
		
		BMW b = new BMW();
		b.name = "BMW";
		b.color = "Black";
		b.price = 4832343; 
	}

}
