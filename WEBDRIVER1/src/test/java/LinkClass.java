import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkClass {
	@Test
	public void LinkModule() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://leafground.com/pages/Link.html");
		aa.findElement(By.linkText("Go to Home Page")).click();
		aa.findElement(By.xpath("(//li[@class='col-lg-3 col-md-3 col-sm-3'])[3]/a")).click();
		WebElement element = aa.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String d = element.getAttribute("href");
		System.out.println(d);
		WebElement element1 = aa.findElement(By.linkText("Verify am I broken?"));
		String link = element1.getAttribute("href");
        HttpURLConnection huc = (HttpURLConnection)(new URL(link).openConnection());
		int status = huc.getResponseCode();
		if (status >= 400) {
			System.out.println(huc+" is a broken link");
		} else {
			System.out.println(huc + " is a valid link");}
		List<WebElement> element2 =aa.findElements(By.tagName("a"));
		int size= element2.size();
		System.out.println("Total number of link"+" "+ size);
	}
}
