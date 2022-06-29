package JavaSessions;

public class Car_staticVsNonStatic {

	String name;
	int price;
	String color;
	static int wheels = 4;
	//static class variable should be the common value
	
	public static void main(String[] args) {
	
		int a = 10;
		
		Car_staticVsNonStatic c1 = new Car_staticVsNonStatic();
		c1.name = "BMW";
		c1.price = 50;
		c1.color = "Black";
		c1.wheels = 4;
		
		Car_staticVsNonStatic c2 = new Car_staticVsNonStatic();
		c2.name = "Audi";
		c2.price = 60;
		c2.color = "Blue";
		c2.wheels = 4;
		
		Car_staticVsNonStatic c3 = new Car_staticVsNonStatic();
		c3.name = "Honda";
		c3.price = 10;
		c3.color = "Red";
		c3.wheels = 4;
		
		//how to access static var
		//no need to create the object
		//1.within the same class,you can access them directly
		System.out.println(wheels);
		
		//2.you can call by the class name
		System.out.println(Car_staticVsNonStatic.wheels);

		//3.call by object reference-----//display the warning 
		System.out.println(c1.wheels);
	}

}
