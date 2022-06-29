package OOP_Encapsulation;

import java.util.ArrayList;

public class Employee1 {

	private String name;
	private int age;
	private int salary;
	private boolean isActive;
	private char gender;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public int getSalary()
	{
		return salary;
	}
	
	public void setActive(boolean isActive)
	{
		this.isActive = isActive;
	}
	public boolean getisActive()
	{
		return isActive;
	}
	
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	public char getGender()
	{
		return gender;
	}
	
	//first method
//	public void getEmployeeInfo(String name,int age,int salary,boolean isActive,char gender)
//	{
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(salary);;
//		System.out.println(isActive);
//		System.out.println(gender);
//	}
	
	
	//second method
	public String getEmployeeInfo()
	{
		return (name + " " + age + " " + salary + " " + isActive + " " + gender);
	}
	

}
