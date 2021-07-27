package pomProperties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javascript2 {

	public static void pagetitle( WebDriver aa) 
	{
		JavascriptExecutor js  = (JavascriptExecutor)aa;
		String title =  js.executeScript("return document.title;").toString();
		System.out.println(title);
	}
	
	public static void click(WebDriver aa, WebElement ee)
	{
		JavascriptExecutor js1  = ((JavascriptExecutor)aa);
		js1.executeScript("arguments[0].click();", ee);
	}
	public static void scrollldown(WebDriver aa)
	{
		JavascriptExecutor js2  = ((JavascriptExecutor)aa);
		js2.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void scrolllup(WebDriver aa)
	{
		JavascriptExecutor js1  = ((JavascriptExecutor)aa);
		js1.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}
	public static void zoom(WebDriver aa)
	{
		JavascriptExecutor js1  = ((JavascriptExecutor)aa);
		js1.executeScript("document.body.style.zoom='150%'");	
	}
	public static void insidescroll(WebDriver aa, WebElement ee1)
	{
		JavascriptExecutor js1  = ((JavascriptExecutor)aa);
		js1.executeScript("arguments[0].scrollIntoView(true)",ee1);	
	}
}
