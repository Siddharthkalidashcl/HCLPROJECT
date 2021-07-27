import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenshortNormal {
	
	@Test
	public void ssModule() throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://leafground.com/home.html");
		TakesScreenshot ss=(TakesScreenshot) aa;
		File sou=ss.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\sid\\Desktop\\HCL ASSIGNMENT\\Screenshort//img1.jpg");
		FileHandler.copy(sou, des);
	}

}
