package ExceptionHandling;

public class TryCatchBlock {

	String name;
	public static void main(String[] args)
	{
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock obj = new TryCatchBlock();
		obj.name = "Tom";
		//obj = null;
		
		
		try {
			System.out.println(obj.name);//NPE
			int a = 9/0;//AE
			System.out.println("Hii");
			System.out.println("Hii");
			System.out.println("Hii");
		}
//		catch(Error e)
//		{
//			System.out.println("some Exception is coming...");
//			e.printStackTrace();
//		}
		
		catch(NullPointerException e)
		{
			System.out.println("NP is coming...");
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
		
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
	}
}
