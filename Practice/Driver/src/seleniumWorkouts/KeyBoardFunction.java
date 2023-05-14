package seleniumWorkouts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardFunction {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver_win32 (2)\\chromedriver.exe" );

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com");

driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
Thread.sleep(2000);
WebElement findElement = driver.findElement(By.xpath("//input[@placeholder='First name']"));
findElement.sendKeys("roger");
Actions done = new Actions (driver);
done.doubleClick(findElement).build().perform();
done.contextClick(findElement).build().perform();
Robot arm = new Robot();
arm.keyPress(KeyEvent.VK_DOWN);
arm.keyRelease(KeyEvent.VK_DOWN);
arm.keyPress(KeyEvent.VK_DOWN);
arm.keyRelease(KeyEvent.VK_DOWN);
arm.keyPress(KeyEvent.VK_ENTER);
arm.keyRelease(KeyEvent.VK_ENTER);
WebElement findElement2 = driver.findElement(By.name("lastname"));
findElement2.click();
//done.contextClick(findElement2).build().perform();
//arm.keyPress(KeyEvent.VK_DOWN);
//arm.keyRelease(KeyEvent.VK_DOWN);
//arm.keyPress(KeyEvent.VK_ENTER);
//arm.keyRelease(KeyEvent.VK_ENTER);
arm.keyPress(KeyEvent.VK_CONTROL);
arm.keyPress(KeyEvent.VK_V);
arm.keyRelease(KeyEvent.VK_CONTROL);
arm.keyRelease(KeyEvent.VK_V);

			}

}
