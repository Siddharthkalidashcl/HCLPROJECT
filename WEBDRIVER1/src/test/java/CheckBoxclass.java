import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxclass {
	@Test
	public void checkboxmodule() {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://leafground.com/pages/checkbox.html");
		aa.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		boolean b=aa.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected();
		System.out.println(b);
		aa.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
        List<WebElement> chek = aa.findElements(By.xpath("(//div[@class='example'])[4]/div/input"));
        int p=chek.size();
        for(int i=0;i<p;i++){
        	
        	chek.get(i).click();
          }
     
	}
}
