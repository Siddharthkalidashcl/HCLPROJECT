import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookies {

	@Test
	public void CookiesModule() {
		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\WEBDRIVER1\\Drivers\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		aa.get("https://www.amazon.com");
        Set<Cookie> css=aa.manage().getCookies();
        int sizee=css.size();
        System.out.println(sizee);
   
        
 //ADD THE COOKIE
        Cookie B=new Cookie("siddharth", "421306");
        aa.manage().addCookie(B);
        Set<Cookie> cs=aa.manage().getCookies();
        int size=cs.size();
        System.out.println(size);
        for(Cookie cc:cs)
        {
        	System.out.println();
        	System.out.println(cc.getName());
        	System.out.println(cc.getValue());
        }
        Cookie b=new Cookie("sp-cdn", "L5Z9:IN");
        aa.manage().deleteCookie(b);
        Set<Cookie> cs2=aa.manage().getCookies();
        int sizeee=cs2.size();
        System.out.println(sizeee);
        for(Cookie cc:cs2)
        {
        	System.out.println();
        	System.out.println(cc.getName());
        	System.out.println(cc.getValue());
        }
        
        
        
		
		
	}
}
