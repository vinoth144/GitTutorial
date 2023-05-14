package intro;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class traverse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https:/rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.cssSelector("form[class='form'] input:nth-child(2)+input")).sendKeys("raja");
		//driver.findElement(By.xpath("//form[@class='form']/input[1]/following-sibling::input")).sendKeys("babu");
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("form input:nth-child(3)+input")).sendKeys("raja");
		
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise");

	WebElement down =	driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select drop = new Select(down);
		
		drop.selectByIndex(2);
		
		Assert.assertEquals(drop.getFirstSelectedOption().getText(), "AED");
		
		drop.selectByVisibleText("USD");
	}

}
