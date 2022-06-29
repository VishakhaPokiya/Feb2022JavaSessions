package JavaSessions;

public class ClassAndObjects {

	int i = 20;//class variable
	
	public static void main(String[] args) {
		
		int i = 10;//local variable
		System.out.println(i);
		
		
		//Create the object of the class :use new keyword
		ClassAndObjects obj = new ClassAndObjects();
		System.out.println(obj.i);
		
		
		//class - template/blue print/catagory for the objects
		//will have class properties which will be used to create the objects
		//object - physical entity,should be create from the class catagory/template
		
		
		
	}

}
