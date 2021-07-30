// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.util.concurrent.TimeUnit;

// import org.apache.poi.xssf.usermodel.XSSFSheet;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.annotations.Test;

// public class fromExcel {

// 	@Test
// 	public void fromexcel() throws IOException {
// 		System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\DataDrivenTesting\\Drivers\\chromedriver.exe");
// 		WebDriver aa = new ChromeDriver();
// 		String file=("C:\\Users\\sid\\Desktop\\HCL ASSIGNMENT\\ReadFile.xlsx");
// 		File ff=new File(file);
// 		FileInputStream fe=new FileInputStream(ff);
// 		XSSFWorkbook ww1=new XSSFWorkbook(fe);  
// 		XSSFSheet s1= ww1.getSheetAt(0);
// 		int row=s1.getLastRowNum();
// 		for(int i=1;i<row+1;i++)
// 		{
// 			String username=s1.getRow(i).getCell(0).getStringCellValue();
// 			String pass=s1.getRow(i).getCell(1).getStringCellValue();
// 			aa.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
// 		aa.get("https://www.saucedemo.com/");

// 		aa.findElement(By.xpath("//input[@id='user-name']")).click();
// 		aa.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
// 		aa.findElement(By.xpath("//input[@id='password']")).click();
// 		aa.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
// 		aa.findElement(By.xpath("//input[@id='user-name']")).clear();
// 		aa.findElement(By.xpath("//input[@id='password']")).clear();
		
// 	}
		
// 	}

// }
