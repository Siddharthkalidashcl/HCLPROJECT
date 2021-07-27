import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonClass {
   @Test
	public void ButtonModule() {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("http://leafground.com/pages/Button.html");
		aa.findElement(By.xpath("//button[@id='home']")).click();
		aa.findElement(By.xpath("(//li[@class='col-lg-3 col-md-3 col-sm-3'])[2]/a")).click();
		WebElement element=aa.findElement(By.xpath("//button[@id='position']"));
		Point point = element.getLocation();
		int xpos=point.getX();
		int ypos=point.getY();
		System.out.println("the position for x and y are"+ " "+ xpos+" "+ ypos);
		WebElement element1=aa.findElement(By.xpath("//button[@id='color']"));
		String s=element1.getAttribute("style");
		System.out.println(s);
		WebElement element2=aa.findElement(By.xpath("//button[@id='size']"));
		Dimension s1=element2.getSize();
		int n1=s1.height;
		int n2=s1.width;
		System.out.println("The Dimension are"+" "+ n1+" "+n2);
		
		
		
}}
