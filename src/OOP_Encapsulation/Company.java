package OOP_Encapsulation;

public class Company {

	public String name;
	private int sharePrice;
	public String hq;
	
	//setter 
	public void setSharePrice(int sharePrice)
	{
		this.sharePrice = sharePrice;
	}
	
	//getter
	public int getSharePrice()
	{
		return sharePrice;
	}
	
	public static void main(String[] args) {
		
		Company c = new Company();
		c.name = "Amazon";
		c.sharePrice = 1000;
		c.hq = "Australia";

	}

}
