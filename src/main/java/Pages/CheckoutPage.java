package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	@FindBy(xpath="//input[contains(@type,'number')]")
	private WebElement quantity;
	
	@FindBy(xpath="(//button[contains(@type,'button')])[2]")
	private WebElement refreshBTN;
	
	@FindBy(linkText="Checkout")
	private WebElement checkoutBTN;
	
	@FindBy(linkText="Continue Shopping")
	private WebElement continueBtn;
	
	@FindBy(xpath="//table[@id=\"productListTable\"]/tbody/tr[5]/td[6]/a[2]")
	private WebElement cart_btn; 
	
	@FindBy(id="dropdownMenu1")
	private WebElement logout_dropdown;
	
	@FindBy(linkText="Logout")
	private WebElement logout;
	

	
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void provideQuantity()
	{
		quantity.clear();
		quantity.sendKeys("2");
	}
	
	public void refreshButton()
	{
		refreshBTN.click();
	}
	
	public void CheckOutButton() throws InterruptedException
	{
		Thread.sleep(3000);
		checkoutBTN.click();
	}
	
	
	public void continueShoppingBtn()
	{
		continueBtn.click();
		
	}
	
	public void cartBtn()
	{
		cart_btn.click();
		
	}
	public void drop_down()
	{
		logout_dropdown.click();
		
	}
	public void log_out()
	{
		logout.click();
		
	}
}
