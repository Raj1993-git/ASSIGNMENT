package org.amazon;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;







public class Base{
	public static WebDriver driver;
	//THE WEBDRIVER REMAINS STATIC
	public  static WebDriver wedrivercalling() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajasekar\\Desktop\\number programs\\Day4Project\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
return driver;}
	
	public static WebDriver gowebpage(String u) {
		driver.get(u);
		return driver;
		}
	// TO LOCATE THE PATH BY id
	public static  List<WebElement> locatepathx(String id) {
List<WebElement> w1 = driver.findElements(By.xpath(id));
return w1;
	 }
	
	// TO LOCATE THE PATH BY XPATH
	public static WebElement locatepathxpath(String id) {
	WebElement w2=driver.findElement(By.xpath(id));
	return w2;}
	//TO CLICK THE BUTTON
	public static void btnclick(WebElement b) {
		b.click();}
	//TO ACQUIRE DATA FROM THE EXCEL
	/*
	 * public static String getdata(int rowNo,int cellnum) throws IOException { File
	 * loc=new
	 * File("C:\\Users\\Rajasekar\\Desktop\\number programs\\Quantity\\files\\raj.snapdeal.xlsx"
	 * ); FileInputStream stream=new FileInputStream(loc); Workbook w=new
	 * XSSFWorkbook(stream); Sheet s=w.getSheet("sheet1"); Row r=s.getRow(rowNo);
	 * Cell c=r.getCell(cellnum); int cellType = c.getCellType(); String name=null;
	 * if(cellType==1) { name= c.getStringCellValue(); } if (cellType==0) { if
	 * (DateUtil.isCellDateFormatted(c)) { new SimpleDateFormat("dd-MMM-yy").format(
	 * c.getDateCellValue()); } else {
	 * String.valueOf((long)c.getNumericCellValue()); }} return name;}
	 */
	public static void td(int i) throws InterruptedException {
Thread.sleep(i);}
	
	/*
	 * public static String pwind() { String pwindow = driver.getWindowHandle();
	 * return pwindow;}
	 * 
	 * 
	 * public static String pwind1() { String pwindow1 = driver.getWindowHandle();
	 * return pwindow1;}
	 */
	 
	public static Set<String> allwind() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;}

public static File scrn(String desti) throws IOException {
	TakesScreenshot tk= (TakesScreenshot) driver;
	File s=tk.getScreenshotAs(OutputType.FILE);
	File d=new File(desti);
	FileUtils.copyDirectory(s, d);
	return d;
	

}
public static String send(WebElement e,String i) {
	e.sendKeys(i);
	return i;}

public static void ro() throws AWTException {
	Robot r=new Robot();
 r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_CONTROL);
	}

}




	

