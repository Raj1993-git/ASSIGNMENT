package org.amazon;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Amazon extends Base {
	public static void main(String[] args) {
		wedrivercalling();
	gowebpage("https://www.amazon.in/");
	WebElement lp1 = locatepathxpath("//input[@id='twotabsearchtextbox']");
	btnclick(lp1);
	send(lp1, "one plus 7");
	WebElement lp2 = locatepathxpath("(//input[@class='nav-input'])[1]");
	btnclick(lp2);
	List<WebElement> locatepathx = locatepathx("//span[@class='a-size-medium a-color-base a-text-normal']");
	
	for (WebElement x : locatepathx) {
		String text = x.getText();
		System.out.println(text);
		
	}
	}

}
