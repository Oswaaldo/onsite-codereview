package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPageExample 
{
	WebDriver driver;
	
	public CheckoutPageExample(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public WebElement emailTextfield()
	{
		return driver.findElement(By.name("email"));
	}
	
	public WebElement nameTextfield()
	{
		return driver.findElement(By.name("name"));
	}
	
	public WebElement address1Textfield()
	{
		return driver.findElement(By.name("address-line1"));
	}
	
	public WebElement address2Textfield()
	{
		return driver.findElement(By.name("address-line2"));
	}
	
	public WebElement cityTextfield()
	{
		return driver.findElement(By.name("city"));
	}
	
	public WebElement zipTextfield()
	{
		return driver.findElement(By.name("zip"));
	}
	
	public WebElement stateDropdown()
	{
		return driver.findElement(By.name("state"));
	}
	
	public WebElement creditCardNumberFrame()
	{
		return driver.findElement(By.id("braintree-hosted-field-number"));
	}
	
	public WebElement creditCardNumberTextfield()
	{
		return driver.findElement(By.id("credit-card-number"));
	}
	
	public WebElement creditCardExpirationTextfield()
	{
		return driver.findElement(By.id("expiration"));
	}
	
	public WebElement creditCardCvvTextfield()
	{
		return driver.findElement(By.id("cvv"));
	}
	
	public WebElement placeYourOrderButton()
	{
		return driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div[1]/div/div[6]/button/span"));
	}
}
