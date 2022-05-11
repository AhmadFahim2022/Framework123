package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run {

	static WebDriver driver;
	
	static Code code = new Code();
	
	public static void main(String []args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fahim Rahmani\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.com");
	
	WebElement searchfieldtaxt=  driver.findElement(By.name("field-keyword"));
	searchfieldtaxt.sendKeys("Computers");
		
		
		
		
	}

}
