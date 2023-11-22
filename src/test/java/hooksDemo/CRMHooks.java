package hooksDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CRMHooks
{
	WebDriver driver;
	
	@Before
	public void setUp()
	{
		System.out.println("Browser opens with Crm application");
		//driver=new ChromeDriver();
		driver=BrowserSetup.setDriver();
		driver.get("https://automationplayground.com/crm/");
	}

	
	
	@After
	public void tearDown()
	{
		System.out.println("Browser close");
	driver.quit();	
	}
}
