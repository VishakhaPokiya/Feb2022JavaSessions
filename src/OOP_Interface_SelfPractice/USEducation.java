package OOP_Interface_SelfPractice;

public interface USEducation extends GlobalEducationSystem{

	public void quality();
	
	public void environment();
	
	public void oppurtunities();
	
	public static void test()
	{
		System.out.println("USE---test");
	}
	default void test1()
	{
		System.out.println("USE---test1");
	}
}
