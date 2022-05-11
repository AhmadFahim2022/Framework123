package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTopointer {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahim Rahmani\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
			driver.navigate().to("https://www.amazon.com");
	        driver.manage().window().maximize();
	        Actions ob=new Actions(driver);
	     //   WebElment hovers=driver.findElement(By.id(""));
	    //    ob.moveToElement(hovers).build().perform();
	}
}
