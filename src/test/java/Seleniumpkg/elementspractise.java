package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementspractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement ele01 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		
		WebElement ele02 = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
		
		ele01.click();
		
		Thread.sleep(1000);
		
		ele02.click();
		
		//checkbox
		
		
		WebElement ele03 = driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
		
		WebElement ele04 = driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
		
		ele03.click();
		
		Thread.sleep(1000);
		
		ele03.click();
		
		Thread.sleep(1000);
		
		ele04.click();
		
		Thread.sleep(1000);
		
		ele04.click();
		
		//images
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		String url01 = "https://www.guru99.com/" ;
				
		driver.get(url01);
		
		WebElement img01 = driver.findElement(By.xpath("//img[@class='custom-logo']"));
		
		img01.click();
		
		if(driver.getCurrentUrl().equals(url01))
		{
			System.out.println(url01);
		}
		else
			System.out.println("image fail");
		
		driver.quit();
		
	}

}
