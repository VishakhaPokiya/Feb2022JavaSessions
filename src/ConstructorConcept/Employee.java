package ConstructorConcept;

public class Employee {
	
	String name;
	int age;
	int id;
	boolean isper;
	char gender;
	double salary;
	
	//constructor
	//name of the cons ------->will be same as the class name
	//cons can no have any return type---->no void ,no return
	//cons--->will be called when you create the object of the class
	//function may or may not return the value but cons ...will never return any value
	//fun name can be anything ....but cons name will be same as the class name
	//fun will have the buss logic/feature logic but ...cons will be helping to create the object
	//to call the function,we need to create the object and use object ref variable
	//but to call the cons....just create the object and supply the values
	
	public Employee()//0 parameter /no return/no void
	{
		System.out.println("This is default constructor");
	}
	public Employee(int a)//1 parameter
	{
		System.out.println(a);
	}
	public Employee(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
	public Employee(String name,int id,int age)
	{
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public Employee(String name,boolean isper)
	{
		this.name = name;
		this.isper = isper;
	}
	public Employee(String name,int id,int age,double salary,boolean isper,char gender)
	{
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.isper = isper;
		this.gender = gender;
	}
	public Employee(String name,char gender)
	{
		this.name = name;
		this.gender = gender;
	}

}
