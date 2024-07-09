package Seleniumpkg;

//import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.Select;

public class guru99p04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://live.techpanda.org/");
		
		WebElement Mobile = driver.findElement(By.xpath("//a[@href='http://live.techpanda.org/index.php/mobile.html']"));
		
		Mobile.click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		WebElement compare1 = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a"));
		
		compare1.click();
		
		driver.navigate().refresh();
		
		WebElement compare2 = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a"));
		
		compare2.click();
		
		driver.findElement(By.xpath("//button[@title=\"Compare\"]")).click();
	
		for (String handle : driver.getWindowHandles()) {
		    driver.switchTo().window(handle);
		    }	
		Thread.sleep(2000);
		
		String p1 = driver.findElement(By.xpath("//a[text()='Sony Xperia']")).getText();
		
		String p2 = driver.findElement(By.xpath("//a[text()='IPhone']")).getText();
		
		System.out.println(p1+p2);
		
		driver.findElement(By.xpath("//button[@title='Close Window']")).click();
		
		
		driver.quit();
		
	}
}