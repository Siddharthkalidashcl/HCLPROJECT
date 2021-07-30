
// import java.io.File;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.util.List;

// import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
// import org.apache.poi.ss.usermodel.Cell;
// import org.apache.poi.ss.usermodel.CellType;
// import org.apache.poi.ss.usermodel.Row;
// import org.apache.poi.xssf.usermodel.XSSFSheet;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;


// public class toExcel {
// public static void main(String[] args) throws IOException, InvalidFormatException {
// 	System.setProperty("webdriver.chrome.driver", "F:\\QSPIDER SQL\\HCL\\DataDrivenTesting\\Drivers\\chromedriver.exe");
// 	WebDriver aa = new ChromeDriver();
// 	aa.get("https://testautomationpractice.blogspot.com/");
// 	List<WebElement> e=aa.findElements(By.xpath("//tr/th"));
// 	List<WebElement> e1=aa.findElements(By.xpath("//tr/td"));
// 	String file=("C:\\Users\\sid\\Desktop\\HCL ASSIGNMENT\\FILE\\final.xlsx");
	
// 	File ff=new File(file);
// 	FileOutputStream fe=new FileOutputStream(ff);
// 	XSSFWorkbook ww1=new XSSFWorkbook();
// 	XSSFSheet s1= ww1.createSheet("Book Details");
// 	int n=e.size();
// 	int n1=e1.size();
// 	System.out.println(n);
// 	for(int i=0;i<n;i++)
// 	{
// 		String e2=e.get(i).getText();
// 		System.out.println(e2);
// 		Row r1=s1.createRow(i);
// 		Cell c1=r1.createCell(1);
// 		c1.setCellType(CellType.STRING);
// 		c1.setCellValue(e2);
// 		ww1.write(fe);
// 	}
// 	for(int i=2;i<6;i++)
// 	{
// 		for(int j=0;j<24;j++) {
// 			String e2=e1.get(j).getText();
// 			System.out.println(e2);
// 			Row r1=s1.createRow(i);
// 			Cell c1=r1.createCell(1);
// 			c1.setCellType(CellType.STRING);
// 			c1.setCellValue(e2);
// 			ww1.write(fe);}}	
// }
// }
