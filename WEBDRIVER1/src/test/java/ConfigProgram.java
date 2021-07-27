import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConfigProgram {

	@Test
	public void ConfigModule() throws IOException, InterruptedException {
		FileInputStream d=new FileInputStream("F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\src\\test\\java\\driver.files");
		WebDriver aa=null;
		Properties u=new Properties();
		u.load(d);
		String Browser=u.getProperty("browser");
		String driverfile=u.getProperty("path");
		if(Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",driverfile);
			aa=new ChromeDriver();
		}
		aa.get("https://www.saucedemo.com");
		Thread.sleep(3000);
		aa.findElement(By.xpath("//input[@id='user-name']")).sendKeys("Siddharth");
		aa.findElement(By.xpath("//input[@id='password']+"
				+ " ")).sendKeys("kalidas");
	}
}
