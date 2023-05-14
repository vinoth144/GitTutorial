package seleniumWorkouts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakePhoto {
	

	
	public static void screenShot( WebDriver driver,String name) throws IOException{
		
		
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(src, new File("C:\\Users\\dinesh babu\\Downloads\\babushot\\"+name+".jpeg"));
	

		
	
			
		}
	
	
	
	

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dinesh babu\\greens practice\\Practice\\Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//driver.get("https://www.amazon.com");
		
		screenShot(driver,"name");
		driver.findElement(By.id("email")).sendKeys("babu");
		screenShot(driver,"username");
		


	}

}
