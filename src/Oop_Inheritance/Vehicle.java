package Oop_Inheritance;

public class Vehicle extends AutoMobile{
	
	@Override
	public void engine()
	{
		System.out.println("Vehicle---engine");
	}
	public void start()
	{
		System.out.println("Vehicle---start");
	}
}
