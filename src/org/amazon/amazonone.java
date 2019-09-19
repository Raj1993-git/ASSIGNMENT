package org.amazon;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;

public class amazonone extends Base {
	public static void main(String[] args) throws InterruptedException {
		wedrivercalling();
		gowebpage("https://www.amazon.in/");
		String wd1 = driver.getWindowHandle();
		WebElement lp1 = locatepathxpath("//input[@id='twotabsearchtextbox']");
		btnclick(lp1);
		send(lp1, "one plus 7");
		WebElement lp2 = locatepathxpath("(//input[@class='nav-input'])[1]");
		btnclick(lp2);
		
		List<WebElement> lp3 = locatepathx("//span[@class='a-size-medium a-color-base a-text-normal']");
		for (WebElement x : lp3) {
			String text = x.getText();
			System.out.println(text);
		}
WebElement lp4 = locatepathxpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]");
		btnclick(lp4);
	
		
		WebElement lp5 = locatepathxpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]");
		btnclick(lp5);

		WebElement lp6 = locatepathxpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]");
		btnclick(lp6);
		
		
		Set<String> allwind = allwind();
		System.out.println(allwind);
		int count=0;
		for (String x : allwind) {
			if (count==3) {
				driver.switchTo().window(x);
			}
			count++;
			
		}
		td(5000);
		int count1=0;
		for (String x : allwind) {
			if (count1==4) {
				driver.switchTo().window(x);
			}
			count1++;
			}
		
		List<WebElement> lp8 = locatepathx("//span[@class='a-list-item']");
		for (WebElement x1 : lp8) {
			String t1 = x1.getText();
			System.out.println(t1);
			
		}
		/*
		 * td(3000); driver.quit();
		 */
		
		
	
	
	}

}
