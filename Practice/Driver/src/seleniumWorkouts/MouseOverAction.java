package seleniumWorkouts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dinesh babu\\greens practice\\Practice\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://www.amazon.in");
		WebElement findElement = driver.findElement(By.xpath("(//a[@class='nav-a  '])[7]"));
		Actions over = new Actions(driver);
		over.moveToElement(findElement).build().perform();
		*/
		/*driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(2000);
	WebElement s =	driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	 s.sendKeys("ayyannar");
	 String text = s.getAttribute("value");
	 System.out.println(text);
	 
	 
	 
		//driver.findElement(By.id("u")).sendKeys("ayyannar");
	 */
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement findElement = driver.findElement(By.id("credit2"));
		WebElement findElement2 = driver.findElement(By.id("bank"));
		Actions  set = new Actions(driver);
		
		
		set.dragAndDrop(findElement,findElement2).perform();
		
		
		
		
		
		
		
		
	 
	 
	}
}