package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;

public class guru99p02 {

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
		
		WebElement price01 = driver.findElement(By.xpath("//span[text()='$100.00']"));
		
		String cost01 = price01.getText();
		
		driver.findElement(By.xpath("//img[@id='product-collection-image-1']")).click();
		 WebElement price02 = driver.findElement(By.xpath("//span[@class='regular-price']//span[@class='price']"));
		String cost02 = price02.getText();
		
		if(cost01.equals(cost02)) {
			System.out.println("costs are equal");
		}
		else
			System.out.println("costs are NOT equal");
		
		//driver.navigate().back();
			
	}

}
