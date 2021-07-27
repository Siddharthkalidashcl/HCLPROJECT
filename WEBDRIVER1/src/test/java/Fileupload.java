import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fileupload {
public static void main(String[] args) throws AWTException, InterruptedException {
	

	
	//public void FileUploadModule() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		aa.get("https://www.ilovepdf.com/excel_to_pdf");
		WebElement p=aa.findElement(By.id("pickfiles"));
		p.click();
		Thread.sleep(4000);
		Robot r=new Robot();
		String fff="C:\\Users\\sid\\Desktop\\HCL ASSIGNMENT\\FILE\\final.xlsx";
		StringSelection ss=new StringSelection(fff);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		r.setAutoDelay(4000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.setAutoDelay(4000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	//	aa.findElement(By.xpath("//input[@id='terms']")).click();
		//aa.findElement(By.xpath("//button[@id='submitbutton']")).click();
/*
		aa.get("http://demo.guru99.com/test/upload/");
		WebElement ele=aa.findElement(By.id("uploadfile_0"));
		//ele.sendKeys("C:/Users/mohanapriya_p/OneDrive - HCL Technologies Ltd/Desktop/Selenium.txt");
		aa.findElement(By.id("terms")).click();
		aa.findElement(By.name("send")).click();
		String file= "C:\\\\Users\\\\sid\\\\Desktop\\\\HCL ASSIGNMENT\\\\doc.txt";
		//aa.close();
*/		  
		 
	}
}
