package JavaSessions;

public class MethodAssignment07 {
	
	public void prime(int a)
	{
		int p = 0;
		if(a==0 || a==1)
		{
			System.out.println(a + " is not prime number");
		}
		else 
		{
			for(int i = 2 ; i<=a/2 ; i++)
			{
				if(a%i==0)
				{
					System.out.println(a + " is not prime number");
					p = 1;
					break;
				}
			}
		}
		if(p==0)
		{
			System.out.println(a + " is prime number");
		}
	}
	
	public static void main(String[] args) {
		
		MethodAssignment07 m = new MethodAssignment07();
		m.prime(10);
	}

}
