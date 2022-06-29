package JavaSessions;

public class ObjectReferenceName {

	//3 properties(Data members) are here -->2 parameters,1 method
	//parameters
	String name;
	int age;
	
	//method
	public void get()
	{
		System.out.println("get Method");
	}
	
	public static void main(String[] args) {
		
		ObjectReferenceName o = new ObjectReferenceName();
//		o = null;//null reference object
//		o.name = "Tom";//NPE
//		o.age = 10;
		
//		System.out.println(o.name);
		
		//no reference object
		new ObjectReferenceName().name = "Vishu";
		new ObjectReferenceName().age = 24;;
		new ObjectReferenceName().get();
		
		ObjectReferenceName o1 = new ObjectReferenceName();
		System.gc();

	}

}
