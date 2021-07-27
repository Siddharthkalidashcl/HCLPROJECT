import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AleartClass1507 {
	@Test
	public void checkboxmodule() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://leafground.com/pages/Alert.html");
		aa.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		 Alert alert = aa.switchTo().alert();	
		 alert.accept();
		 aa.switchTo().defaultContent();
		 aa.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		 Alert alert1 = aa.switchTo().alert();	
		 alert1.dismiss();
		 aa.switchTo().defaultContent();
		 aa.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		 Alert alert2 = aa.switchTo().alert();
		 alert2.sendKeys("HCL Technology");
		 alert2.accept();
		aa.switchTo().defaultContent();
    	aa.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();
		 Alert alert3=aa.switchTo().alert();
		String s= alert3.getText();
		System.out.println(s);
		alert3.accept();
		aa.switchTo().defaultContent();
		aa.findElement(By.xpath("//button[@id='btn']")).click();
		aa.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
		
		
		
		
	}
	
}
