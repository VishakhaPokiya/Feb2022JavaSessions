package JavaSessions;

public class MainMethodOverLoading {
    //only  interview question
	//we can create main method overlodad but java only follow the public static void main with String array parameter
	
	public static void main(String[] args) {
		
		System.out.println("Main 1"+ args);
		System.out.println("Main 1" + args[0]);

	}
	public static void main(int a) {
		
		System.out.println("Main 2" + a);

	}
	public static void main(int a,int b) {
		
		System.out.println("Main 3" + a + b);

	}
	public static void main(String a) {
		
		System.out.println("Main 4" + a);

	}

}
