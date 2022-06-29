package JavaSessions;

public class MethodAssignment06 {

	public void vote(int age)
	{
		if(age>=18)
		{
			System.out.println("You can vote");
		}
		else 
		{
			System.out.println("You can not vote");
		}
	}
	public static void main(String[] args) {
		
		MethodAssignment06 m =new MethodAssignment06();
		m.vote(11);
		m.vote(20);
		m.vote(6);
		m.vote(75);
	}

}
