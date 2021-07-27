import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AleartClass15072 {

	@Test
	public void checkboxmodule() {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://demo.automationtesting.in/Alerts.html");
		aa.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		aa.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert = aa.switchTo().alert();
		alert.accept();
		aa.switchTo().defaultContent();
		
	   aa.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	   aa.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	   Alert alert1 = aa.switchTo().alert();
	   alert1.accept();
	   aa.switchTo().defaultContent();
	   aa.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	   
	   aa.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	   Alert alert2 = aa.switchTo().alert();	
	   alert2.sendKeys("hello world");
	   alert2.accept();
	
	
	}
}
