package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pomProperties.Javascript2;

public class JavaSscript1 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
	WebDriver aa = new ChromeDriver();
	aa.get("https://demo.nopcommerce.com/");
	Javascript2.pagetitle(aa);
	WebElement ee=aa.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
	Javascript2.click(aa, ee);
	Thread.sleep(4000);
	Javascript2.scrollldown(aa);
	Thread.sleep(5000);
	Javascript2.scrolllup(aa);
	Thread.sleep(3000);
	Javascript2.zoom(aa);
	aa.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/scrollbar_themes_demo.html");
	WebElement ee1=aa.findElement(By.xpath("(//div[@class='mCSB_draggerContainer'])[2]/div/div"));
	Javascript2.insidescroll(aa, ee1);
	
}
}
