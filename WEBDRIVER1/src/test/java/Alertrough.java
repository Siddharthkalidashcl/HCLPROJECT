import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alertrough {

	
	@Test
	public void checkboxmodule() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("https://demoqa.com/alerts");
		aa.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert a=aa.switchTo().alert();
		a.sendKeys("hello word");
		Thread.sleep(4000);
		a.accept();
		aa.switchTo().defaultContent();
		aa.close();
		
		
}}
