package OOP_Interface_SelfPractice;

public class IIT extends Education implements USEducation,UKEducation,IndianEducation{

	@Override
	public void fees() {
		System.out.println("IIT---fees");
	}

	@Override
	public void regulation() {
		System.out.println("IIT---Regulation");
	}

	@Override
	public void travelService() {
		System.out.println("IIT---travelService");
	}

	@Override
	public void EcademicRecord() {
		System.out.println("IIT---EcademicRecord");
	}

	@Override
	public void qualification() {
		System.out.println("IIT---qualification");
	}

	@Override
	public void quality() {
		System.out.println("IIT---quality");
	}

	@Override
	public void environment() {
		System.out.println("IIT---environment");
	}

	@Override
	public void oppurtunities() {
		System.out.println("IIT---oppurtunities");
	}
	
	@Override
	public void rules()
	{
		System.out.println("IIT---rules");
	}

	@Override
	public void goodKnowledge() {
		System.out.println("IIT---goodKnowledge");
	}
	
	@Override
	public void test1()
	{
		System.out.println("USE---test1");
	}

}
