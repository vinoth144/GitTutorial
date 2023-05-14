package seleniumWorkouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class addactin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dinesh babu\\greens practice\\Practice\\Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adactinhotelapp.com");
		driver.findElement(By.id("username")).sendKeys("nishokshab");
		driver.findElement(By.id("password")).sendKeys("098765");
		driver.findElement(By.id("login")).click();
		WebElement findElement = driver.findElement(By.id("location"));
		
		Select done = new Select(findElement);
		done.selectByValue("London");
		
		
		WebElement findElement1 = driver.findElement(By.id("hotels"));
		Select done1 = new Select(findElement1);
		//Thread.sleep(2000);
		done1.selectByValue("Hotel Creek");
		
		WebElement findElement2 = driver.findElement(By.id("room_type"));
		Select act = new Select(findElement2);
		act.selectByIndex(3);
		
		
		
		
		
		WebElement findElement3 = driver.findElement(By.name("room_nos"));
		
		Select act1 = new Select(findElement3);
		act1.selectByIndex(2);
		
		
		Thread.sleep(2000);
		
		WebElement findElement4 = driver.findElement(By.id("datepick_in"));
		findElement4.sendKeys("18/10/2022");
		
		WebElement findElement5 = driver.findElement(By.name("datepick_out"));
		findElement5.sendKeys("20/10/2022");
		
		
		WebElement findElement6 = driver.findElement(By.name("adult_room"));
		Select method = new Select(findElement6);
		method.selectByIndex(3);
		
		WebElement findElement7 = driver.findElement(By.name("child_room"));
		Select move = new Select(findElement7);
		move.selectByIndex(1);
		
		
		WebElement findElement9 = driver.findElement(By.id("Submit"));
		findElement9.click();
		
		WebElement findElement10 = driver.findElement(By.id("radiobutton_0"));
		findElement10.click();
		
		WebElement findElement11 = driver.findElement(By.id("continue"));
		findElement11.click();
		
		
		WebElement findElement12= driver.findElement(By.id("first_name"));
		findElement12.sendKeys("nishok");
		
		WebElement findElement13 = driver.findElement(By.id("last_name"));
		findElement13.sendKeys("kumar");
		
		WebElement findElement41 = driver.findElement(By.id("address"));
		findElement41.sendKeys("cuddalore");
		
		
		WebElement findElement42 = driver.findElement(By.id("cc_num"));
		findElement42.sendKeys("4564342812349673");
		
		WebElement findElement48 = driver.findElement(By.id("cc_type"));
		Select move3 = new Select(findElement48);
		move3.selectByIndex(1);
		
		
		
		WebElement findElement43 = driver.findElement(By.id("cc_exp_month"));
		
		Select move1 = new Select(findElement43);
		move1.selectByIndex(10);
		
		WebElement findElement44 = driver.findElement(By.id("cc_exp_year"));
		
		Select move2 = new Select(findElement44);
		move2.selectByValue("2021");
		
		WebElement findElement45 = driver.findElement(By.id("cc_cvv"));
		findElement45.sendKeys("342");
	
	
		
		WebElement findElement46 = driver.findElement(By.id("book_now"));
		findElement46.click();
		
		
		
		
		
		
		
		
	}

}
