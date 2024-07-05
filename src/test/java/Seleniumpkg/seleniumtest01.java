package Seleniumpkg;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://saucelabs.com");
		
		System.out.println(driver.getCurrentUrl());
		
		
		driver.quit();
		
	}

}
