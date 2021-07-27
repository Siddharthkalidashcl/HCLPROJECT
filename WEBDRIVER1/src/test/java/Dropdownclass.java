import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdownclass {

	@Test
	public void Dropmodule() {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://leafground.com/pages/Dropdown.html");
		WebElement ele1 = aa.findElement(By.xpath("//select[@id='dropdown1']"));
		Select s1 = new Select(ele1);
		s1.selectByIndex(1);
		WebElement ele2 = aa.findElement(By.xpath("//select[@name='dropdown2']"));
		Select s2 = new Select(ele2);
		s2.selectByVisibleText("Appium");
		WebElement ele3 = aa.findElement(By.xpath("//select[@name='dropdown3']"));
		Select s3 = new Select(ele3);
		s3.selectByValue("3");
		List<WebElement> ele4 = aa.findElements(By.xpath("//select[@class='dropdown']/option"));
		int size=ele4.size();
		System.out.println(size);
		aa.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("u");
		aa.findElement(By.xpath("(//div[@class='example']/select)[5]")).click();
		aa.findElement(By.xpath("((//div[@class='example']/select)/option[5])[6]")).click();
	}
}
