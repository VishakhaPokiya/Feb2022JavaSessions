package ConstructorConcept;

public class Users {

	String firstName;
	int userId;
	boolean isActive;
	String city;
	public Users(String firstName, int userId, boolean isActive, String city)
	{
		this.firstName = firstName;
		this.userId = userId;
		this.isActive = isActive;
		this.city = city;
	}
	public Users(String firstName, int userId) 
	{
		this.firstName = firstName;
		this.userId = userId;
	}
	public Users(String firstName, boolean isActive,String city)
	{
		this.firstName = firstName;
		this.isActive = isActive;
		this.city = city;
	}
	
	
	
}
