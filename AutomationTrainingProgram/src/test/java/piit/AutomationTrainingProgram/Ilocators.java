package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahim Rahmani\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\chromedriver.exe");
	

		driver=new ChromeDriver();
			driver.navigate().to("https://www.amazon.com");
	        driver.manage().window().maximize();
	        WebElement Searchfieldtaxt=  driver.findElement(By.name("field-keywords"));
	        Searchfieldtaxt.sendKeys("computer");
	    WebElement  Searchicon=  driver.findElement(By.id("nav-search-submit-button"));
	        Searchicon.click();
	        WebElement linktax=driver.findElement(By.linkText("Registry"));
	        linktax.click();
	      
	        
	        
	}        
	

}
