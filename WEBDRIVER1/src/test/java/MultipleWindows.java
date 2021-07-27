import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindows {

	@Test
	public void WindowsModule() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://leafground.com/pages/Window.html");
		aa.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
		Set<String> rr =aa.getWindowHandles();
		int val= rr.size();
		System.out.println(val);
		aa.findElement(By.xpath("//button[@id='home']")).click();
		aa.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
		Set<String> rr1 =aa.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(rr1);
	    int ll=rr1.size();
	    for(int i=0;i<ll;i++)
	    {
	    	if(i>0)
	    	{
	    		aa.switchTo().window(list.get(i));
	    		aa.close();
	    	}}
		Set<String> rl =aa.getWindowHandles();
		ArrayList<String> list1 = new ArrayList<String>(rl);
		 int lla=0;
	    aa.switchTo().window(list1.get(lla));
       aa.findElement(By.xpath("//button[@onclick='openWindowsWithWait();']")).click();
      aa.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	}
	
}
