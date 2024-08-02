package testscripts;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.AddToCart;
import Pages.AddressPage;
import Pages.CheckoutPage;
import Pages.LandingPage;
import Pages.LoginPageUser;
import Pages.OrderConfirmationPage;
import Pages.PaymentDetails;


public class TestingPage extends BaseTest{
	@Test (priority=0)
	public void positiveScenarioUser() throws InterruptedException
	{
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		Thread.sleep(5000);
		LoginPageUser login=new LoginPageUser(driver);
		LandingPage landingPage=new LandingPage(driver);
		AddToCart addCart=new AddToCart(driver);
		CheckoutPage ck=new CheckoutPage(driver);
		AddressPage ap=new AddressPage(driver);
		PaymentDetails payment=new PaymentDetails(driver);
		OrderConfirmationPage ob=new OrderConfirmationPage(driver);
		//VerifyRemainingQuantity vq= new VerifyRemainingQuantity(driver);
		
		//User Login	
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
		Thread.sleep(5000);
		login.loginButton();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		Thread.sleep(5000);
		login.enterUsername();
		login.enterPassword();
		login.loginSuccessful();
		Thread.sleep(3000);
		
		//Click View of Paracetamol Medicine on Landing Page
		landingPage.clickViewParacetamol();
		Thread.sleep(3000);		
		
		//Add the medicine to Cart
		addCart.verifyQuantityBefore();
		addCart.addToCart();
		Thread.sleep(3000);
		
		//Update Quantity and refresh the Amount
		ck.provideQuantity();
		ck.refreshButton();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Checkout")));
		Thread.sleep(5000);
		ck.CheckOutButton();
		Thread.sleep(3000);
		
		//Select Address for Delivery
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Select")));
		Thread.sleep(5000);
		ap.selectAddress();
		Thread.sleep(3000);
		
		//Payment Details provided
		payment.cardNumberDetails();
		payment.expiryMonthDetails();
		payment.expiryYearDetails();
		payment.cvvNumberDetails();
		payment.PayBtn();
		Thread.sleep(3000);
		
		//Order Confirmation Page
		String actualText=ob.getSuccessMessage();
		String expectedText="Your Order is Confirmed!!";
		if(actualText.equals(expectedText))
		{
			System.out.println("Success Message Verified");
		}
		
		else
		{
			System.out.println("Invalid Success Message");
		}
		
		System.out.println("Proceeding to Continue Shopping Page");
		ob.continueShoppingBtn();
		Thread.sleep(5000);
		ck.drop_down();
		Thread.sleep(5000);
		ck.log_out();
		
		//Verifying remaining Quantity
		//Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Home")));
		//vq.HomePage();
		//Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@class,'btn')])[2]")));
		//landingPage.clickViewParacetamol();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'col')])[4]/h6")));
		//vq.verifyQuantityAfter();
		
		
	}
	
	@Test (priority=1)
	public void add_twoitems_to_cart() throws InterruptedException
	{
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		Thread.sleep(5000);
		LoginPageUser login=new LoginPageUser(driver);
		LandingPage landingPage=new LandingPage(driver);
		AddToCart addCart=new AddToCart(driver);
		CheckoutPage ck=new CheckoutPage(driver);
		AddressPage ap=new AddressPage(driver);
		PaymentDetails payment=new PaymentDetails(driver);
		OrderConfirmationPage ob=new OrderConfirmationPage(driver);
		
		//User Login	
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
		Thread.sleep(5000);
		login.loginButton();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		Thread.sleep(5000);
		login.enterUsername();
		login.enterPassword();
		login.loginSuccessful();
		Thread.sleep(3000);
		
		//Click View of Paracetamol Medicine on Landing Page
		landingPage.clickViewParacetamol();
		Thread.sleep(3000);		
		
		//Add the medicine to Cart
		addCart.verifyQuantityBefore();
		addCart.addToCart();
		Thread.sleep(3000);
		
		//Update Quantity and refresh the Amount
		//ck.cartBtn();
		ck.provideQuantity();
		ck.refreshButton();
		Thread.sleep(3000);	
		ck.continueShoppingBtn();
		Thread.sleep(3000);	
		ck.cartBtn();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Checkout")));
		Thread.sleep(5000);
		ck.CheckOutButton();
		Thread.sleep(3000);
		
		//Select Address for Delivery
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Select")));
		Thread.sleep(5000);
		ap.selectAddress();
		Thread.sleep(3000);
		
		//Payment Details provided
		payment.cardNumberDetails();
		payment.expiryMonthDetails();
		payment.expiryYearDetails();
		payment.cvvNumberDetails();
		payment.PayBtn();
		Thread.sleep(3000);
		
		//Order Confirmation Page
		String actualText=ob.getSuccessMessage();
		String expectedText="Your Order is Confirmed!!";
		if(actualText.equals(expectedText))
		{
			System.out.println("Success Message Verified");
		}
		
		else
		{
			System.out.println("Invalid Success Message");
		}
		
		System.out.println("Proceeding to Continue Shopping Page");
		ob.continueShoppingBtn();
		Thread.sleep(5000);
		ck.drop_down();
		Thread.sleep(5000);
		ck.log_out();
		
		
	}
}
