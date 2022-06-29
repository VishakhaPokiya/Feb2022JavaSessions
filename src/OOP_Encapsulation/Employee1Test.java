package OOP_Encapsulation;

import java.util.ArrayList;

public class Employee1Test {

	public static void main(String[] args) {
		
		Employee1 e = new Employee1();
		
		e.setName("Vishu");
		e.setAge(24);
		e.setSalary(5000000);
		e.setActive(true);
		e.setGender('F');
		
		//first method
		//e.getEmployeeInfo(e.getName(), e.getAge(), e.getSalary(), e.getisActive(), e.getGender());
		
		
		//second method 
		System.out.println(e.getEmployeeInfo());
		
	}

}
