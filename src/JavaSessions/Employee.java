package JavaSessions;

public class Employee {
	
	String name;
	int age;
	String city;
	double salary;
	boolean isper;
	char gender;
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		//e --> object ref name 
		//RHS --> new Employee() --->is object
		//Employee -->class -->non primitive data type
		
		e.name = "Vishu";
		e.age = 23;
		e.city = "Surat";
		e.salary = 100.9;
		e.isper = true;
		
		System.out.println(e.name + " " + e.age + " " + e.city + " " + e.salary + " " + e.isper);
		
		Employee e1 = new Employee();
		e1.name = "Polo";
		System.out.println(e1.name + " " + e1.age + " " + e1.city + " " + e1.salary + " " + e1.isper);
		System.out.println(e1.gender);
	}

}
