package ExceptionHandling;

public class ThrowKeyWord {

	public static void main(String[] args)
	{
		//CUSTOM EXCEPTION
		try{
			throw new Exception("NAVEENEXCEPTION");
		}
		catch(Exception e)
		{
			System.out.println("Some exception is coming...");
			e.printStackTrace();
		}
		
		String data = null;
		if(data==null)
		{
			try{
				throw new Exception("DATANOTFOUNDEXCEPTION");
			}
			catch(Exception e)
			{
				System.out.println("Some exception is coming...");
				e.printStackTrace();
			}
		}
		//webpage --- element e1
		//e1 is not present
		//e1 prop is missing...throw new Exception("ELEMENTPROPNOTFOUNDEXCEPTION");
	}
	
}
