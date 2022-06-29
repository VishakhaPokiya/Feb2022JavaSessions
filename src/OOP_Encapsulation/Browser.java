package OOP_Encapsulation;

public class Browser {

	public void launchBrowser()
	{
		System.out.println("Launch Browser");
		checkVersion();
		checkOSVersion();
		checkEnoughRam();
	}
	public void getBrVersion()
	{
		checkVersion();
	}
	private void checkVersion()
	{
		System.out.println("Check Version");
	}
	private void checkOSVersion()
	{
		System.out.println("Check OS Version");
	}
	private void checkEnoughRam()
	{
		System.out.println("Check Enough Ram");
	}
	public static void main(String[] args) {
		
		

	}

}
