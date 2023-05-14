package seleniumWorkouts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dinesh babu\\greens practice\\Practice\\Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 pro max",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text() ='Apple iPhone 13 Pro Max (1TB) - Graphite']")).click();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println("Parent id is "+windowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("All windows id is"+windowHandles);
		
		for(String x:windowHandles) {
			if (windowHandle!=x) {
				driver.switchTo().window(x);
				System.out.println("child window"+x);
			}
		}
		Thread.sleep(10000);
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.switchTo().window(windowHandle);
	}

}
