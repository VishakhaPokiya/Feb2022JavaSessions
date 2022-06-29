package JavaSessions;

public class LoopsAssignment {

	public static void main(String[] args) {
		
		//1.
		int i = 0;
		while(i<=4)
		{
			System.out.println("I am Batman");
			i++;
		}
		
		
		//2.
		int i1 = 1;
		while(i1<=9)
		{
			System.out.println("I am batman " + (i1));
			i1++;
		}
		
		
		//3.
		int i2 = 10;
		while(i2>0)
		{
			System.out.println(i2);
			i2--;
		}
		
		int i3 = 10;
		do {
			System.out.println(i3);
			i3--;
		}
		while(i3>0);
		
		for(int i4 = 10 ; i4>0 ; i4--)
		{
			System.out.println(i4);
		}
		
		
		//4.
		int i5 = 0;
		while(i5<10)
		{
			System.out.println("Hello World");
			i5++;
		}
		
		
		//5.
		int i6 = 1;
		while(i6<=10)
		{
			System.out.println(i6);
			if(i6==7)
			{
				break;
			}
			i6++;
		}

	}

}
