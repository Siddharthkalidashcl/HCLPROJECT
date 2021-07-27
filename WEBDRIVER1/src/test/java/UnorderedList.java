import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnorderedList {

	@Test
	public void UnorderedListModule() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://demo.automationtesting.in/AutoComplete.html");
        WebElement el=aa.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']/input"));
        el.click();
        el.sendKeys("a");
        Thread.sleep(4000);
        List<WebElement> elei=aa.findElements(By.xpath("//div[@id='menucontainer']/ul/li/a"));
        int n=elei.size();
        System.out.println(n);
        for(int i=0;i<n;i++)
        {
        	if((elei.get(i)).getText().equalsIgnoreCase("Albania"))
        	{
        		(elei.get(i)).click();
        	}
        }     
	}
}
