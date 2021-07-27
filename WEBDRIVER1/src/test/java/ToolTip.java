import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTip {

	@Test
	public void tooltipModule() {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("https://omayo.blogspot.com");
		WebElement t=aa.findElement(By.xpath("//input[@class='gsc-search-button']"));
		System.out.println(t.getAttribute("title"));

		//Second Way 
		aa.get("https://demoqa.com/tool-tips");
		WebElement t1=aa.findElement(By.xpath("//button[@id='toolTipButton']"));
		Actions a=new Actions(aa);
		a.moveToElement(t1);
		a.build().perform();
 		//System.out.println(t.getText());
        String toolTipText = t1.getText();
        System.out.println("toolTipText-->"+toolTipText); 		 
/*
 * 
    @Test()
    public void ele() {
        System.setProperty("webdriver.chrome.driver","C:/Users/mohanapriya_p/Downloads/chromedriver_win32/Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/tool-tips");
        System.out.println("demoqa webpage Displayed");
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Hover me to see']"));
        actions.moveToElement(element).perform(); 
        WebElement toolTip = driver.findElement(By.xpath("//input[@autocomplete='off']")); 
        String toolTipText = toolTip.getText();
        System.out.println("toolTipText-->"+toolTipText); 
        if(toolTipText.equalsIgnoreCase("We ask for your age only for statistical purposes.")){ 
             System.out.println("Pass* : Tooltip matching expected value");
             }else{
             System.out.println("Fail : Tooltip NOT matching expected value"); 
             } 
         driver.close(); }}
 */

	}
}
