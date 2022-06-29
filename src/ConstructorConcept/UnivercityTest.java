package ConstructorConcept;

import java.lang.reflect.Array;

public class UnivercityTest {

	public static void main(String[] args) {
		
		Univercity u = new Univercity("Windsor","Canada");
		System.out.println(u.getName() + " " + u.getCountry());
		
		Univercity u1 = new Univercity("Windsor","Canada","12-02-2022");
		System.out.println(u1.getName() + " " + u1.getCountry() + " " + u1.getStablishedDate());
	}

}
