package org.amazon;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Snapdeal7 extends Base {
	public static void main(String[] args) throws AWTException, InterruptedException {
		wedrivercalling();
		gowebpage("https://www.snapdeal.com/");
		WebElement lp1 = locatepathxpath("//input[@id='inputValEnter']");
	btnclick(lp1);
	send(lp1, "one plus 7");
	WebElement lp2 = locatepathxpath("//button[@class='searchformButton col-xs-4 rippleGrey']");
	btnclick(lp2);
	List<WebElement> lp3 = locatepathx("//p[@class='product-title']");
	for (WebElement x : lp3) {
		String text = x.getText();
		System.out.println(text);}
		WebElement lp4 = locatepathxpath("(//p[@class='product-title'])[1]");
		btnclick(lp4);
	
		WebElement lp5 = locatepathxpath("(//p[@class='product-title'])[2]");
		btnclick(lp5);
		WebElement lp6 = locatepathxpath("(//p[@class='product-title'])[3]");
		btnclick(lp6);
		td(5000);
		for (int i = 0; i <4; i++) {
			ro();
		}
		td(5000);
		driver.quit();
		
	}
	
	}


