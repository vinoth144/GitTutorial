package intro;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.testng.Assert;



public class Run {

	public static void main(String[] args) throws InterruptedException  {
	

		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https:/rahulshettyacademy.com/locatorspractice");
		
		driver.findElement(By.id("inputUsername")).sendKeys("babu");
		driver.findElement(By.cssSelector("input[name*='input']")).sendKeys("ksfu");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("ju");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("hfhf");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("6p966676");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'pwd')]")).click();
		System.out.println(driver.findElement(By.xpath("//form/p")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("samapuram");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();        
		Thread.sleep(2000);
Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in."); 

 driver.findElement(By.xpath("//button[text()='Log Out']")).click();
//driver.close();
	}
	
}
