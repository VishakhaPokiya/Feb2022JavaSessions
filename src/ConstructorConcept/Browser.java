package ConstructorConcept;

import java.util.ArrayList;

public class Browser {

//	2. Design a browser class template with the following features:
//		 variables:
//		browserName
//		vendorName
//		currentVersion
//		List of plugins supported by Browser in Array List<String>
//
//
//		--Design the constructor of this class with different parameters and all parameters.
//
//
//		--Write the get method of each variable with return keyword. 
	
	
	private String browserName;
	private String vendorName;
	private String currentVersion;
	private ArrayList<String> a = new ArrayList<String>();
	
	
	public Browser(String browserName, String vendorName, String currentVersion, ArrayList<String> a) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.a = a;
	}

	public Browser(String browserName,String vendorName,String currentVersion)
	{
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
	}
	
	public String getBrowserName() {
		return browserName;
	}

	public String getVendorName() {
		return vendorName;
	}
 
	public String getCurrentVersion() {
		return currentVersion;
	}
	
	public ArrayList<String> getA()
	{
		return a;
	}

}
