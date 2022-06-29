package OOP_Interface;

public class TestHospital {

	public static void main(String[] args)
	{
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.entServices();
		fh.medialTraining();
		fh.oncologyServices();
		fh.orthoServices();
		fh.pediaServices();
		USMedical.billing(); 
		fh.medInsurance();//always overridden method will be called
		fh.covidTest();
		UNHG.covidGuideLines();
		fh.medicalInformation();
		System.out.println(USMedical.min_fees);
//		USMedical.min_fees = 200;-->here, we can not change the value because in interface value is by default static or final in nature
		System.out.println();
		
		
		//top casting
		//child class object can be referred by parent interface ref variable
		
		USMedical us = new FortisHospital();
		us.physioServices();
		us.oncologyServices();
		us.cardioServices();
		us.emergencyServices();
		us.medInsurance();//always overridden method will be called
		System.out.println();
		
		UKMedical uk = new FortisHospital();
		uk.entServices();
		uk.pediaServices();
		uk.emergencyServices();
		System.out.println();

		
		IndianMedical in = new FortisHospital();
		in.orthoServices();
		in.dentalServices();
		in.emergencyServices();
		
		
		//down Casting:(Compile Time)---not allowed
		//Parent interface object can be referred by child  class ref variable
		
		//FortisHospital fh1 = new USMedical();
		
		
	}
}
