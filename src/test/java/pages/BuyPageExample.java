package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyPageExample 
{
	WebDriver driver;
	
	public BuyPageExample(WebDriver driver) 
	{
		this.driver = driver;
	}

	public WebElement classicTShirt()
	{
		return driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div/div/div[2]/div[2]/div[5]/div[2]/div[2]/div/div[8]/div/div/div/div/img"));
	}
	
	public WebElement colorJNavy()
	{
		return driver.findElement(By.xpath("(//div[@style='background-color: rgb(10, 34, 69);'])[2]"));
	}
	
	public WebElement sizeM()
	{
		return driver.findElement(By.xpath("//*[@id=\"product_details_size_container\"]/div[2]/div/div[2]/div"));
	}
	
	public WebElement qtyDropdown()
	{
		return driver.findElement(By.xpath("//i[@class='mdi mdi-chevron-down fs-icon-1p5']"));
	}
	
	public WebElement qty2()
	{
		return driver.findElement(By.xpath("//div[text()='2']"));
	}
	
	public WebElement buyItNowButton()
	{
		return driver.findElement(By.xpath("//span[text()='Buy it now']"));
	}
}
