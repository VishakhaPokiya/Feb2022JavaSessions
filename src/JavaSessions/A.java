package JavaSessions;

public class A {

	public static void main(String[] args) {
		
		//StackOverflowError
		//it's generating infinite stack----->and java will throw error of stack overflow
		System.out.println("Main A");
		B.main(args);
		
	}

}
