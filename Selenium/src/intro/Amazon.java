package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.amazon.in/");
		
	
		
	
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("dnshbabu25@gmail.com");
		
		driver.findElement(By.xpath("//span[@class='a-button-inner']/input")).click();
		
		driver.findElement(By.xpath("//input[@maxlength='1024']")).sendKeys("dinesh");
		
		driver.findElement(By.xpath("//input[contains(@class,'button')]")).click();
	}

}
