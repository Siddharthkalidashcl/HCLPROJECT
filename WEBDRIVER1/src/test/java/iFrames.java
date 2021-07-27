import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrames {

	
	@Test
	public void iFrameModule() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://leafground.com/pages/frame.html");
		//int a = aa.findElements(By.tagName("iframe")).size();
		int aaa= aa.findElements(By.xpath("//div[@id='wrapframe']")).size();
		System.out.println(aaa);
		aa.switchTo().frame(0);
		aa.findElement(By.xpath("//button[@id='Click']")).click();
		aa.switchTo().defaultContent();
        WebElement e=		aa.findElement(By.xpath("//iframe[@src='page.html']"));
        aa.switchTo().frame(e);
        WebElement e1=aa.findElement(By.xpath("//iframe[@src='nested.html']"));
        aa.switchTo().frame(e1);
        aa.findElement(By.xpath("//button[@id='Click1']")).click();	}}
