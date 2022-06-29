package ConstructorConcept;

import java.util.ArrayList;


public class Univercity {
	
//	1. Design a University class template with the following features:
//		 variables:
//		name﻿
//		country
//		stablishedDate
//		List of course provided in Array List<String>
//
//
//		--Design the constructor of this class with different parameters and all parameters.
//
//
//		--Write the get method of each variable with return keyword. 
	
	private String name;
	private String country;
	private String stablishedDate;
	private ArrayList<String> course = new ArrayList<String>();
	
	public Univercity(String name,String country)
	{
		this.name = name;
		this.country = country;
	}
	
	public Univercity(String name,String country,String stablishedDate)
	{
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
	}
	
	public Univercity(String name,String country,String stablishedDate,ArrayList<String> course)
	{
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStablishedDate() {
		return stablishedDate;
	}
	public void setStablishedDate(String stablishedDate) {
		this.stablishedDate = stablishedDate;
	}
	public ArrayList<String> getCourse() {
		return course;
	}
	public void setCourse(ArrayList<String> course) {
		this.course = course;
	}
}
