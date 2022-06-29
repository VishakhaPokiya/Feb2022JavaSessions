package OOP_Interface_SelfPractice;

public class TestEducation {
	public static void main(String[] args)
	{
		IIT i = new IIT();
		i.EcademicRecord();
		i.environment();
		i.fees();
		i.oppurtunities();
		i.qualification();
		i.quality();
		i.regulation();
		i.rules();
		i.travelService();
		i.goodKnowledge();
		Education.guideLines();
		USEducation.test();//static method
		i.test1();//default method
		System.out.println();
		
		//top casting
		USEducation us = new IIT();
		us.quality();
		us.environment();
		us.oppurtunities();
		us.goodKnowledge();
		USEducation.test();
		System.out.println();
		
		
		UKEducation uk = new IIT();
		uk.EcademicRecord();
		uk.goodKnowledge();
		uk.qualification();
		uk.travelService();
		System.out.println();
		
		IndianEducation ie = new IIT();
		ie.fees();
		ie.regulation();
		ie.goodKnowledge();
		System.out.println();
	
		NIT n = new NIT();
		n.EcademicRecord();
		n.environment();
		n.fees();
		n.goodKnowledge();
		n.oppurtunities();
		n.qualification();
		n.quality();
		n.regulation();
		n.rules();
		n.travelService();
		n.guideLines();
		System.out.println();
		
		USEducation us1 = new NIT();
		us1.environment();
		us1.oppurtunities();
		us1.quality();
		us1.goodKnowledge();
		System.out.println();
		
		UKEducation uk1 = new NIT();
		uk1.EcademicRecord();
		uk1.qualification();
		uk1.travelService();
		uk1.goodKnowledge();
		System.out.println();
		
		IndianEducation ie1 = new NIT();
		ie1.fees();
		ie1.regulation();
		ie1.goodKnowledge();
		System.out.println();
		
		UIT u = new UIT();
		u.EcademicRecord();
		u.environment();
		u.fees();
		u.oppurtunities();
		u.qualification();
		u.quality();
		u.regulation();
		u.rules();
		u.travelService();
		u.guideLines();
		System.out.println();
		
		USEducation us2 = new UIT();
		us2.environment();
		us2.goodKnowledge();
		us2.oppurtunities();
		us2.quality();
		System.out.println();
		
		UKEducation uk2 = new UIT();
		uk2.EcademicRecord();
		uk2.qualification();
		uk2.travelService();
		uk2.goodKnowledge();
		System.out.println();
		
		IndianEducation ie2 = new UIT();
		ie2.fees();
		ie2.regulation();
		ie2.goodKnowledge();
	}

}
