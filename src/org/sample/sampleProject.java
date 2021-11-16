package org.sample;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleProject {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prince\\eclipse-workspace\\GitHub\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.navigate().to("https://www.toolsqa.com/");
		driver.navigate().back();
		
		
		
		
		
		
//		Set<String> windowHandle = driver.getWindowHandles();
//		System.out.println(windowHandle);
//		ArrayList<String> list=new ArrayList<String>(windowHandle);
//		driver.switchTo().window(list.get(0));
//		driver.quit();
//		
		
	}

}
