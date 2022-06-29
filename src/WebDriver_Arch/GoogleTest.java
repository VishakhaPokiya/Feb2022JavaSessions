package WebDriver_Arch;

public class GoogleTest {

	static WebDriver driver;
	
	public static void main(String[] args)
	{
		//ChromeDriver driver = new ChromeDriver();
		//FireFoxDriver driver = new FireFoxDriver();
		
		//cross browser logic
		
		String browser = "chrome";
		
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FireFoxDriver();
		}
		else if(browser.equals("safari"))
		{
			driver = new SafariDriver();
		}
		else
		{
			System.out.println("Plzz pass the right browser...");
		}
		
		driver.get("http://www.google.com");
		driver.getTitle();
		
		driver.searchElement();
		driver.searchElements();
		
		driver.click();
		driver.sendKeys("admin@gmail.com");
		driver.close();
	}
	
}
