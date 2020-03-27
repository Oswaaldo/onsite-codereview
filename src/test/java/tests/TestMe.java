package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pages.BuyPageExample;
import pages.CartPageExample;
import pages.CheckoutPageExample;
import pages.ReceiptPageExample;

public class TestMe 
{
	public WebDriver driver;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/opt/chromedriver/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void checkoutFlowTest() throws InterruptedException
	{	
		BuyPageExample buyPage = new BuyPageExample(driver);
		CartPageExample cartPage = new CartPageExample(driver);
		CheckoutPageExample checkoutPage = new CheckoutPageExample(driver);
		ReceiptPageExample receiptPage = new ReceiptPageExample(driver);
		
		driver.get("https://teechip.ooapi.com/defaulttest");
		Thread.sleep(2000);
		
		// select the product, color, size, and qty
		buyPage.classicTShirt().click();
		Thread.sleep(1000);
		buyPage.colorJNavy().click();
		buyPage.sizeM().click();
		buyPage.qtyDropdown().click();
		Thread.sleep(1000);
		buyPage.qty2().click();
		buyPage.buyItNowButton().click();
		Thread.sleep(1000);
		
		// proceed from the cart page
		cartPage.proceedToCheckoutButton().click();
		Thread.sleep(1000);
		
		// fill in information on checkout page
		checkoutPage.emailTextfield().sendKeys("jesse.wenren@scalablepress.com");
		checkoutPage.nameTextfield().sendKeys("Test Me");
		checkoutPage.address1Textfield().sendKeys("180 Montgomery St");
		checkoutPage.address2Textfield().sendKeys("STE 1000");
		checkoutPage.cityTextfield().sendKeys("San Francisco");
		
		Select country = new Select(checkoutPage.stateDropdown());
		country.selectByVisibleText("California");
		
		checkoutPage.zipTextfield().sendKeys("94104");
		
		driver.switchTo().frame(checkoutPage.creditCardNumberFrame());
		checkoutPage.creditCardNumberTextfield().sendKeys("4111111111111111");
		checkoutPage.creditCardExpirationTextfield().sendKeys("1234");
		checkoutPage.creditCardCvvTextfield().sendKeys("123");
		checkoutPage.placeYourOrderButton().click();
		
		// validate order successful
		// wait for upsell to load
		Thread.sleep(10000);
		receiptPage.upsellCloseIcon().click();
		assertTrue(receiptPage.thankYouHeader().isDisplayed());
	}
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.quit();
	}
	
	
}
