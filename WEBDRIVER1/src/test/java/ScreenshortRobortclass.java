import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshortRobortclass {
	@Test
	public void ssModule1() throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://leafground.com/pages/Alert.html");
		aa.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		Robot r=new Robot();
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec=new Rectangle(d);
		BufferedImage ig=r.createScreenCapture(rec);
		File des=new File("C:\\Users\\sid\\Desktop\\HCL ASSIGNMENT\\Screenshort//img2.jpg");
		ImageIO.write(ig, "jpg", des);
		

}
}