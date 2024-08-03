package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

WebDriver driver;
	
	@BeforeTest
	public WebDriver launchBrowser()
	{
			//Launch the Browser
		 WebDriverManager.firefoxdriver().setup();
   		 driver = new FirefoxDriver();
			
			//Maximize the Window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Navigate to the Application
			driver.get("http://localhost:8080/medicare/home");
			return driver;
	 }
	
	 @AfterMethod
	    public void tearDown() {
	   	 
	   	 driver.quit();
	    }
}
