package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUser {
	@FindBy(linkText="Login")
	private WebElement loginBtn;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//input[contains(@value,'Login')]")
	private WebElement loginBtnUser;	
	
	public LoginPageUser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginButton() throws InterruptedException
	{
		Thread.sleep(5000);
		loginBtn.click();
	}
	
	public void enterUsername()
	{
		username.sendKeys("test1@xyz.com");
	}

	public void enterPassword()
	{
		password.sendKeys("test1@123");
	}
	
	public void loginSuccessful()
	{
		loginBtnUser.click();
	}
	
	

}
