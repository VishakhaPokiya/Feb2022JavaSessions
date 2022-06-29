package Oop_Inheritance;

public class CarTest {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();//Overridden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.engine();
		BMW.drive();//static method which is call by class name or call directly
		//b.drive();
		System.out.println();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		Car.drive();
		System.out.println();
		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.theftSafety();
		a.sportMode();
		System.out.println();
		
		//child class object can be referred by parent class ref variable:  
		//top Casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		System.out.println();
		
		//child class object can be referred by grant Parent class ref variable:
		Vehicle v = new BMW();
		v.engine();
		System.out.println();

		
		//down casting
		//Parent class object can be referred by child class ref variable?
//		BMW b1 = (BMW)new Car();//ClassCastException
//		b1.start();
		
		//grant parent class object can be referred child ref variable?
		//BMW b2 = (BMW) new Vehicle();
		
		
		AutoMobile a1 = new AutoMobile();
		a1.practical();
		a1.design();
		a1.manufacture();
		System.out.println();
		
		Physics p = new Physics();
		p.physical();
		System.out.println();
		
		
		Science s = new AutoMobile();
		s.practical();
		System.out.println();
		
		Science s1 = new Physics();
		s1.practical();
		s1.observations();
		System.out.println();
		
		Science s2 = new Vehicle();
		s2.engine();
	}

}
