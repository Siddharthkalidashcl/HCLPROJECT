import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class toExcel {

	
	@Test
	public void editModule() {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://leafground.com/pages/Edit.html");
		aa.findElement(By.xpath("//input[@id='email']")).sendKeys("Random@gmail.com");
		aa.findElement(By.xpath("//input[@value='Append ']")).clear();
		aa.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Siddharth Kalidas");
		WebElement  element =aa.findElement(By.xpath("(//input[@name='username'])[1]"));
		System.out.println(element.getAttribute("value"));
		aa.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		WebElement  element1=aa.findElement(By.xpath("(//input[@type='text'])[5]"));
		boolean b=element1.isEnabled();
		if(b==false)
		{
		System.out.println("It is disabled");}
		else {
			System.out.println("It is enabled");
		}
	}
}
