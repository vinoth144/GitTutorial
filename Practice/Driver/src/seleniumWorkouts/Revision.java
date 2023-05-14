package seleniumWorkouts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Revision {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver_win32 (2)\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
WebElement element = driver.findElement(By.id("fruits"));
		

	 
	 
			Select s = new Select(element);
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
			List<WebElement> options = s.getOptions();
			
				for(int i = 0 ;i<options.size()-1;i++) {
					
					WebElement webElement = options.get(i);
				
					String text = webElement.getText();
					System.out.println(text);
				}
				
				
		
	}
		
	}


