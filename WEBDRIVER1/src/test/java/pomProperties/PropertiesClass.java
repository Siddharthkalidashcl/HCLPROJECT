package pomProperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PropertiesClass {	
	
	@FindBy(xpath="//input[@id='postal-code']")
	public static WebElement pincode;
//	
	@FindBy(xpath="//input[@id='continue']")
	public static WebElement confirm;

	public static WebElement username(WebDriver aa )
	{
		return aa.findElement(By.xpath("//input[@id='user-name']"));
	}
	public static WebElement passworddd(WebDriver aa )
	{
		return aa.findElement(By.xpath("//input[@id='password']"));
	}
	public static WebElement submit(WebDriver aa )
	{
		return aa.findElement(By.xpath("//input[@id='login-button']"));
	}
	public static WebElement registation(WebDriver aa)
	{
		return aa.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	}
	public static WebElement Firstname(WebDriver aa)
	{
		return aa.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
	}
	public static WebElement Lastname(WebDriver aa)
	{
		return aa.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
	}
	public static WebElement Email(WebDriver aa)
	{
		return aa.findElement(By.xpath("//div[@id='shopping_cart_container']"));
	}
	public static WebElement passwrod(WebDriver aa)
	{
		return aa.findElement(By.xpath("//button[@id='checkout']"));
	}
	public static WebElement days(WebDriver aa )
	{
		
		return aa.findElement(By.xpath("//input[@id='first-name']"));
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	public static WebElement lastnameee;

//	public static WebElement days(WebElement aa )
//	{
//	}

}
