package piit.AutomationTrainingProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnd {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahim Rahmani\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
			driver.navigate().to("https://www.amazon.com");
	        driver.manage().window().maximize();
	       WebElement dropable=(WebElement) driver.findElements(By.linkText("Daggable"));
	       dropable.click();
	       driver.switchTo().frame(0);
	      //ebElement ElementToDrag=(WebElement) driver.findElements(By.id("draggable");
	       
	        

}
}