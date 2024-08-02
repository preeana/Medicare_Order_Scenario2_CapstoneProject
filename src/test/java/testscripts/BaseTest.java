package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
			//Launch the Browser
		 WebDriverManager.firefoxdriver().setup();
   		 driver = new FirefoxDriver();
			
			//Maximize the Window
			driver.manage().window().maximize();
			
			//Navigate to the Application
			driver.get("http://localhost:8080/medicare/home");
	 }
	
	@AfterTest
	public void closeBrowser()
	{
		//Close the Browser
		driver.quit();

	}
}
