package OOP_Interface_SelfPractice;

public class NIT extends Education implements USEducation,UKEducation,IndianEducation{

	@Override
	public void fees() {
		System.out.println("NIT---fees");
	}

	@Override
	public void regulation() {
		System.out.println("NIT---regulation");
	}

	@Override
	public void travelService() {
		System.out.println("NIT---travelService");
	}

	@Override
	public void EcademicRecord() {
		System.out.println("NIT---EcademicRecord");
	}

	@Override
	public void qualification() {
		System.out.println("NIT---qualification");
	}

	@Override
	public void quality() {
		System.out.println("NIT---quality");
	}

	@Override
	public void environment() {
		System.out.println("NIT---environment");
	}

	@Override
	public void oppurtunities() {
		System.out.println("NIT---oppurtunities");
	}
	
	@Override
	public void rules()
	{
		System.out.println("NIT---rules");
	}

	@Override
	public void goodKnowledge() {
		System.out.println("NIT---goodKnowledge");
	}

}
