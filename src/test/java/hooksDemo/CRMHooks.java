package hooksDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CRMHooks
{
	public WebDriver driver;
	
	@Before
	public void setUp()
	{
		System.out.println("Browser opens with Crm application");
		//driver=new ChromeDriver();
		driver=BrowserSetup.setDriver();
		driver.get("https://automationplayground.com/crm/");
	}

	
	//click on Signin=Login
	
	@Before("@Login")
	public void loginSetUp()
	{
		driver.findElement(By.id("SignIn")).click();	
	}
	
	//User must be login==logout
	@Before("@SignOut")
	public void logoutSetUp()
	{
		driver.findElement(By.id("SignIn")).click();
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("submit-id")).click();	
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Browser close");
		driver.quit();	
	}
}
