package JavaSessions;

public class User {
	
	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		//very important interview que
		
		User u1 = new User();
		u1.name = "Rohit";
		u1.age = 27;
		u1.city = "Torronto";
		
		User u2 = new User();
		u2.name = "Vishu";
		u2.age = 23;
		u2.city = "Surat";
		
		User u3 = new User();
		u3.name = "Virohi";
		u3.age = 27;
		u3.city = "Torronto";
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println("---------------------------------------------");
		
		u1 = u2;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println("---------------------------------------------");
		
		u2 = u3;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);	
		System.out.println("---------------------------------------------");
		
		u3 = u1;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		//object ref:
		//no ref == true
		//one ref == true
		//mutipal ref == true
		
	}

}
