package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPageExample 
{
	WebDriver driver;
	
	public CartPageExample(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public WebElement proceedToCheckoutButton()
	{
		return driver.findElement(By.xpath("//span[text()='Proceed to Checkout']"));
	}
}
