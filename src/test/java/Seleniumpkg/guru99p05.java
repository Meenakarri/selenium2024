package Seleniumpkg;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.*;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.Select;

public class guru99p05 {
	
	public static String firstname = "John" ;
	
	public static String lastname = "Doe" ;
	
	public static String emailaddress = "test014@yopmail.com" ;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://live.techpanda.org/");
		
		WebElement crtacc = driver.findElement(By.xpath("//a[@class='skip-link skip-account'] //span[@class='label']"));
		
		crtacc.click();
		
		WebElement myacc = driver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[1]/a"));
		
		myacc.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
	
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(emailaddress);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@title='Register']")).submit();
		
		
	WebElement text01= driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span"));
	
	String verf = text01.getText();
	
	System.out.println(verf);
	
	driver.findElement(By.xpath("//a[text()='TV']")).click();
	
	driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")).click();
	
	driver.findElement(By.xpath("//span[text()='Share Wishlist']")).click();
	
	driver.findElement(By.xpath("//textarea[@id='email_address']")).sendKeys(emailaddress);
	
	driver.findElement(By.xpath("//button[@title='Share Wishlist']")).submit();
	
	}
	
	
	
	
}