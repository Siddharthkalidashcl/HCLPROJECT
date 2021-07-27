import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrderedList {
	
	@Test
	public void OrderedListModule() {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://demo.automationtesting.in/Selectable.html");
		aa.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
        List<WebElement> el=aa.findElements(By.xpath("//ul[@class='SerializeFunc']/li"));
        Actions a=new Actions(aa);
		WebElement ee=el.get(1);
		WebElement ee1=el.get(3);
		WebElement ee2=el.get(5);
		a.keyDown(Keys.CONTROL); 
		a.click(ee);
		a.click(ee1);
		a.click(ee2);
		a.build().perform();
	}

}
