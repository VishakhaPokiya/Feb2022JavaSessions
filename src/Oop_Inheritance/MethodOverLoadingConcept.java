package Oop_Inheritance;

public class MethodOverLoadingConcept {

	public void start()
	{
		
	}
	public void start(int a)
	{
		System.out.println(a);
	}
	public void start(String a,int b)
	{
		
	}
public static void main(String[] args){
		
		MethodOverLoadingConcept m = new MethodOverLoadingConcept();
		m.start(10);
		
	}
}
