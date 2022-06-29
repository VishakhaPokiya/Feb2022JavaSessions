package SuperKeyword;

public class Page {
	
	int timeOut = 100;
	public Page()
	{
		System.out.println("Page...default");
	}
	public Page(int a)
	{
		System.out.println("Page..." + a);
	}
	public Page(int a,int b)
	{
		System.out.println("Page..." + (a+b));
	}
	public void display()
	{
		System.out.println("Page...display");
	}
}
