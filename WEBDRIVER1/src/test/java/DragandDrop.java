import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {

	@Test
	public void DragandDropModule() {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://leafground.com/pages/drag.html");
		WebElement e1=aa.findElement(By.xpath("//div[@id='draggable']"));
		Actions ac=new Actions(aa);
		ac.dragAndDropBy(e1, 215, 57);
		ac.build().perform();
	}
}
