package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Adding_twoItems_toCart {
	@FindBy(xpath="(//a[contains(@class,'btn')])[2]")
	private WebElement view;
	
	WebDriver driver;
	public Adding_twoItems_toCart(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickViewParacetamol() {
		view.click();
	}
}
