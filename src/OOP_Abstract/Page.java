package OOP_Abstract;

//abstract class object can not be created
//abstract constructor..can be created
//It will be called when we create the object of child class
public abstract class Page {

	public Page()
	{
		System.out.println("Page---Default Constructor");
	}
	public Page(int t)
	{
		System.out.println("Page---one parameter constructor " + t);
	}
	
	public abstract void title();
	
	public abstract void url();
	
	public void header()
	{
		System.out.println("Page---header");
	}
	public final void logo()
	{
		System.out.println("Page---logo");
	}
}
