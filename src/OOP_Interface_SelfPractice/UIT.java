package OOP_Interface_SelfPractice;

public class UIT extends Education implements USEducation,UKEducation,IndianEducation{

	@Override
	public void fees() {
		System.out.println("UIT---fees");
	}

	@Override
	public void regulation() {
		System.out.println("UIT---regulation");
	}

	@Override
	public void travelService() {
		System.out.println("UIT---travelService");
	}

	@Override
	public void EcademicRecord() {
		System.out.println("UIT---EcademicRecord");
	}

	@Override
	public void qualification() {
		System.out.println("UIT---qualification");
	}

	@Override
	public void quality() {
		System.out.println("UIT---quality");
	}

	@Override
	public void environment() {
		System.out.println("UIT---environment");
	}

	@Override
	public void oppurtunities() {
		System.out.println("UIT---oppurtunities");
	}
	
	@Override
	public void rules()
	{
		System.out.println("UIT---rules");
	}

	@Override
	public void goodKnowledge() {
		System.out.println("UIT---goodKnowledge");
	}

}
