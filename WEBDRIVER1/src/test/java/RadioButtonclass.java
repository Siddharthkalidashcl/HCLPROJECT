import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonclass {

	@Test
	public void radiobuttinmodule() {
	System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
	WebDriver aa = new ChromeDriver();
	aa.get("http://leafground.com/pages/radio.html");
	aa.findElement(By.xpath("//input[@id='no']")).click();
	List<WebElement> ele= aa.findElements(By.xpath("//div[@class='large-6 small-12 columns']/label/input"));
	 int l=ele.size();
	 for(int i=0;i<l;i++)
	 {
		 boolean b=ele.get(i).isSelected();
		 if(b==true)
		 {
			 System.out.println(ele.get(i)+" "+"It is selected");
		 }
	 }
	 aa.findElement(By.xpath("//input[@value='2']")).click();
}
}