package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;

public class guru99p01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://live.techpanda.org/");
		
		WebElement Mobile = driver.findElement(By.xpath("//a[@href='http://live.techpanda.org/index.php/mobile.html']"));
		Mobile.click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Select sort = new Select(driver.findElement(By.xpath("//select[@title='Sort By'][1]")));
		
		sort.selectByVisibleText("Name");
		
		
	}

}
