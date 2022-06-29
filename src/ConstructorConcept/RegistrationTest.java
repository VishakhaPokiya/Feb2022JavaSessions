package ConstructorConcept;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration r = new Registration("Mac" ,"Donald" , "mac123@gmail.com" , "7048805343" , "Mac@123" , "Mac@123");
		
		System.out.println(r.getFirstName());
		System.out.println(r.getLastName());
		System.out.println(r.getEmail());
		System.out.println(r.getTelephone());
		System.out.println(r.getPassword());
		System.out.println(r.getConfirmPassword());
		System.out.println();
		
		//update the value
		r.setEmail("mac456@gmail.com");
		System.out.println(r.getEmail());
		System.out.println();
		
		r.setPassword("Mac@456");
		System.out.println(r.getPassword());
		System.out.println();
		
		System.out.println(r.getFirstName());
		System.out.println(r.getLastName());
		System.out.println(r.getEmail());
		System.out.println(r.getTelephone());
		System.out.println(r.getPassword());
		System.out.println(r.getConfirmPassword());
		System.out.println();
	}

}
