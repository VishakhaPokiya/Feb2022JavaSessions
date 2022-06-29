package JavaSessions;

public class ArrayAssignment {

	public static void main(String[] args) {
		
		//Que.1
		for(int i = 0 ; i<4 ; i++)
		{
			for(int j = 0 ; j<10 ; j++)
			{
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		//Que.3
		for(int i = 4; i>=0 ; i--)
		{
			System.out.println("n = " + i);
		}
		System.out.println("-----------------------------------------");
		
		//Que.2
		
		String emp[] = new String[1];
		emp[0] = "Vishu";
		int empage[] = new int[1];
		empage[0] = 20;
		String empteam[] = new String[1];
		empteam[0] = "Laxmi";
		char empgender[] = new char[1];
		empgender[0] = 'F';
		double empsr[] = new double[1];
		empsr[0] = 10.9;
		int empdob[] = new int[1];
		empdob[0] = 1998;
		
		System.out.println("Employee Name : " + emp[0]);
		System.out.println("Age : " + empage[0]);
		System.out.println("Team Name : " + empteam[0]);
		System.out.println("Gender : " + empgender[0]);
		System.out.println("Strike Rate : " + empsr[0]);
		System.out.println("Date Of Birth : " + empdob[0]);
		
		System.out.println("-------------------------------------------");
		
		Object a[] = new Object[6];
		a[0] = "Rohit";
		a[1] = 27;
		a[2] = "BAPS";
		a[3] = 'M';
		a[4] = 100.7;
		a[5] = 1993;
		
		Object a1[] = new Object[6];
		a1[0] = "Virohi";
		a1[1] = 25;
		a1[2] = "Laxmi";
		a1[3] = 'F';
		a1[4] = 101.7;
		a1[5] = 1996;
		
		Object a2[] = new Object[6];
		a2[0] = "Rushi";
		a2[1] = 23;
		a2[2] = "Vamika";
		a2[3] = 'F';
		a2[4] = 122.7;
		a2[5] = 1995;
		
		for(int i = 0 ; i<a.length ; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("-----------------------------------");
		
		for(Object o : a)
		{
			System.out.println(o);
		}
		System.out.println("-----------------------------------");
		
		for(int i = 0 ; i<a1.length ; i++)
		{
			System.out.println(a1[i]);
		}
		System.out.println("------------------------------------");
		
		for(int i = 0 ; i<a2.length ; i++)
		{
			System.out.println(a2[i]);
		}
		System.out.println("------------------------------------");

		
	}

}
