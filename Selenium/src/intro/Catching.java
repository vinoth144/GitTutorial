package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Catching {

	


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https:/rahulshettyacademy.com/locatorspractice");
		//driver.findElement(By.linkText("Forgot your password?")).click();
		String code = get(driver);
		//driver.findElement(By.xpath("//button[contains(@class,'pwd')]")).click();
		//System.out.println(driver.findElement(By.xpath("//form/p")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("samapuram");
		driver.findElement(By.name("inputPassword")).sendKeys(code);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();        
		Thread.sleep(2000);
Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in."); 

driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	}

	
	public static  String get(WebDriver driver) throws InterruptedException {
		
	
	
		driver.get("https:/rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'pwd')]")).click();
		String password= driver.findElement(By.xpath("//form/p")).getText();
		String [] pass = password.split("'");
		
		String [] bought = pass[1].split("'");
		String took=bought[0];
		
		return took;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
