import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Generalscommands {

	@Test
	public void GeneralModule() {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://demo.automationtesting.in/Loader.html");
		aa.navigate().to("www.google.com");
		aa.manage().window().maximize();
// IMPLICIT WAit
//		aa.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		aa.findElement(By.xpath("//button[@id='loader']")).click();
//		aa.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		WebDriverWait ww= new WebDriverWait(aa,60);
		ww.until(ExpectedConditions.elementToBeClickable(aa.findElement(By.xpath("(//button[@type='button'])[3]")))).click();
		aa.navigate().refresh();
		aa.navigate().back();
		aa.navigate().forward();
		Dimension f= new Dimension(250, 350);
		aa.manage().window().setSize(f);
		
		
		
		
	}
}
