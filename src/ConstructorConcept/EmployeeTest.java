package ConstructorConcept;

public class EmployeeTest {
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.name = "Peter";
		e.age = 25;
		e.id = 100;
		e.isper = true;
		e.gender = 'M';
		
		Employee e1 = new Employee(10);
		
		Employee e2 = new Employee("Peter",100);
		System.out.println(e2.name + " " + e2.id);
		
		Employee e3 = new Employee("Peter",100,24);
		System.out.println(e3.name + " " + e3.id + " " + e3.age);
		
		Employee e4 = new Employee("Peter" , true);
		System.out.println(e4.name + " " + e4.isper);
		
		Employee e5 = new Employee("Peter",100,24,100.0,true,'M');
		System.out.println(e5.name + " " + e5.salary);
	
		//Users class
		Users u = new Users("Rihan", 101 , true ,"Suart");
		Users u1 = new Users("Rihan",102);
		Users u2 = new Users("Rihan", true ,"Anand");
		
		//
//		Sustem s = new Syatem();//We can not create the object of the system class because System class have 
//		already inbuilt default constructor
	}
	
}
