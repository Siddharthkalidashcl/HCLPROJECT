package pom1;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pomProperties.PropertiesClass;

public class FunctionalClass {
	
	@Test
	public void module1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("https://www.saucedemo.com/");
		PageFactory.initElements(aa, PropertiesClass.class);

//		Thread.sleep(9000);
		PropertiesClass.username(aa).sendKeys("standard_user");
		PropertiesClass.passworddd(aa).sendKeys("secret_sauce");
		PropertiesClass.submit(aa).click();
		PropertiesClass.registation(aa).click();
		PropertiesClass.Firstname(aa).click();
		PropertiesClass.Lastname(aa).click();
		PropertiesClass.Email(aa).click();
		Thread.sleep(2000);
		PropertiesClass.passwrod(aa).click();
		PropertiesClass.days(aa).sendKeys("Siddharth");
		PropertiesClass.lastnameee.sendKeys("kalidas");
		PropertiesClass.pincode.sendKeys("421306");
		PropertiesClass.submit(aa).click();
		Select s=new Select(PropertiesClass.lastnameee);
		
		 Alert alert = aa.switchTo().alert();
		 Actions ac=new Actions(aa);
		
	}

}
