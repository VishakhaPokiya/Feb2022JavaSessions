package OOP_Interface;

public interface USMedical extends WHO{
	
	public int min_fees = 100;
	//between class and interface -- implements
	//between class and class -- extends
	//between interface and interface--extends
	//can not have method body
	//only method prototype---abstract methods(non static)
	//no method body,only method declaration 
	//interface can not have the buss logic
	//can not create the object of interface
	
	public void physioServices();
	
	public void oncologyServices();
	
	public void cardioServices();
	
	public void emergencyServices();
	
	
	//after jdk 1.8 
	//1.you can have the static methods with the body
	public static void billing()
	{
		System.out.println("USMedical---billing");
	}
	
	//2.can have default method with method body(non static)
	default void medInsurance()
	{
		System.out.println("US---med Insurance");
	}
}
