package JavaSessions;

public class MethodAssignment08 {

	public void grade(int a)
	{
		if(a>90 && a<=100)
		{
			System.out.println("AA grade");
		}
		else if(a>80 && a<=90)
		{
			System.out.println("AB grade");
		}
		else if(a>70 && a<=80)
		{
			System.out.println("BB grade");
		}
		else if(a>60 && a<=70)
		{
			System.out.println("BC grade");
		}
		else if(a>50 && a<=60)
		{
			System.out.println("CD grade");
		}
		else if(a>40 && a<=50)
		{
			System.out.println("DD grade");
		}
		else if(a<=40)
		{
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) {
	
		MethodAssignment08 m = new MethodAssignment08();
		m.grade(67);

	}

}
