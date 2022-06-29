package Oop_Inheritance;

public class BMW extends Car {
	
	//Method Overloading : only within the same class
	//Poly(Many) + Morphism(Forms)---->Compile Time polyMorphism
	
	//Overridden method
	//Method Overriding :Poly(Many) + Morphism(forms)---->Runtime polymorphism
	
	//when you have a method in the parent class and the same method you have in the child class with:
	//the same name
	//same number of parameters
	//with the same signature 
	//private methods can not be overridden
	
	@Override
	public void start()
	{
		System.out.println("BMW----start");
	}
	
	public void autoParking()
	{
		System.out.println("BMW----autoParking");
	}
//	public static void drive()
//	{
//		System.out.println("BMW----drive");
//	}

}
