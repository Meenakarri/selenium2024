package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
//import org.openqa.selenium.support.ui.Select;

public class guru990p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://live.techpanda.org/");
		
		WebElement Mobile = driver.findElement(By.xpath("//a[@href='http://live.techpanda.org/index.php/mobile.html']"));
		Mobile.click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//Select sort = new Select(driver.findElement(By.xpath("//select[@title='Sort By'][1]")));
		
		//sort.selectByVisibleText("Name");
		
		WebElement product01 = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span"));
		
		product01.click();
		
		if (driver.getCurrentUrl().equals("http://live.techpanda.org/index.php/checkout/cart/")) {
			
			driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("1000");
			
			driver.findElement(By.xpath("//span[text()='Update']")).click();
		}
		
		else
			System.out.println("URL incorrect");
		
		WebElement text= driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/ul/li/ul/li/span"));
		
		System.out.println (text.isDisplayed());

	
	}
	
	
}
	
		
		