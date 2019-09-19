package org.amazon;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class amazoniphone extends Base{
public static void main(String[] args) throws InterruptedException {
	wedrivercalling();
	gowebpage("https://www.amazon.in/");
	WebElement lp1 = locatepathxpath("//input[@id='twotabsearchtextbox']");
	btnclick(lp1);
	send(lp1, "iphone 7");
	WebElement lp2 = locatepathxpath("(//input[@class='nav-input'])[1]");
	btnclick(lp2);
	List<WebElement> lp3 = locatepathx("//span[@class='a-size-medium a-color-base a-text-normal']");
for (WebElement x : lp3) {
	String text = x.getText();
	System.out.println(text);}
WebElement lp4 = locatepathxpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]");
JavascriptExecutor jk=(JavascriptExecutor) driver;
jk.executeScript("arguments[0].click()",lp4);
td(5000);
driver.quit();
}
}

