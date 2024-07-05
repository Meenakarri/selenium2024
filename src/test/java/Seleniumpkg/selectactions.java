package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class selectactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		//dropdown
		
		Select drpdwn = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		
		drpdwn.selectByVisibleText("INDIA");
		
		drpdwn.selectByValue("HUNGARY");
		
		if(drpdwn.isMultiple())
		{
			System.out.println("pass");
		}
		
		else
			System.out.println("fail");
			
		//datepickers
		
		
	}

	
	
	
}
