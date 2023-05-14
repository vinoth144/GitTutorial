package seleniumWorkouts;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dinesh babu\\greens practice\\Practice\\Driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://netbanking.hdfcbank.com/netbanking/");

WebElement element = driver.findElement(By.name("login_page"));
driver.switchTo().frame(element);

WebElement findElement = driver.findElement(By.name("fldLoginUserId"));
findElement.sendKeys("babu");
	
		Thread.sleep(3000);
	
	}

}
