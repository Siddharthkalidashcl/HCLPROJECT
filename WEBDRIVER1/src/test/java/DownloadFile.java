import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFile {
	@Test
	public void DownlodModule() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://leafground.com/pages/download.html");
		aa.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		aa.findElement(By.linkText("Download Excel")).click();
		Thread.sleep(6000);
		File f=new File("C:\\Users\\sid\\Downloads");
		File[] h=f.listFiles();
		for( File u:h)
		{
			if(u.getName().equalsIgnoreCase("testleaf.xlsx"))
			{
				System.out.println("File is present ");
			
			break;
			}
		}
	}

}
