package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReceiptPageExample 
{
	WebDriver driver;
	
	public ReceiptPageExample(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public WebElement upsellCloseIcon()
	{
		return driver.findElement(By.xpath("//i[@class='mdi mdi-window-close cursor-pointer fs-icon-1p5 mr-p5 lg:mr-1']"));
	}
	
	public WebElement thankYouHeader()
	{
		return driver.findElement(By.xpath("//span[text()='Thank You For Your Order!']"));
	}
}
