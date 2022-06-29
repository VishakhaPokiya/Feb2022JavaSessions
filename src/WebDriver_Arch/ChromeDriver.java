package WebDriver_Arch;

public class ChromeDriver implements WebDriver{

	public ChromeDriver()
	{
		System.out.println("launch Chrome browser...");
	}
	@Override
	public void searchElement() {
		System.out.println("search Element");
	}

	@Override
	public void searchElements() {
		System.out.println("search Elements");
	}

	@Override
	public void click() {
		System.out.println("click on element");
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("Enter the value :" + value);
	}

	@Override
	public void get(String url) {
		System.out.println("launch url : " + url);
	}

	@Override
	public String getTitle() {
		return "some title";
	}

	@Override
	public void close() {
		System.out.println("close the browser");
	}

	
}
