package seleniumWorkouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DayOne {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\Users\\dinesh babu\\greens practice\\Practice\\Driver\\geckodriver.exe" );
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com");

WebElement pck= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
pck.click();

Thread.sleep(2000);

WebElement findElement = driver.findElement(By.id("day"));

Select drop = new Select(findElement);
drop.selectByIndex(9);

WebElement findElement2 = driver.findElement(By.id("month"));
Select drop1 = new Select(findElement2);
drop1.selectByVisibleText("Apr");

//WebElement findElement3 = driver.findElement(By.className("_9407"));
//Select drop2 = new Select(findElement3);
//drop2.selectByVisibleText("1992");




















	}

}
