package aaaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeWork {

	public WebDriver driver;
	
	@Test
	public void ChromeMethod()
	{
	   driver = new ChromeDriver();
	   driver.get("https://google.com");
	}
}