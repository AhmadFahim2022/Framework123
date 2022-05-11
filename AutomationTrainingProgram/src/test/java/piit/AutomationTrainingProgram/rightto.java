package piit.AutomationTrainingProgram;

import java.net.BindException;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightto {
	
	static WebDriver driver;
	public static void main1(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahim Rahmani\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
			driver.navigate().to("https://www.amazon.com");
	        driver.manage().window().maximize();

		// TODO Auto-generated method stub
	        WebElement picture=driver.findElement(By.xpath("//*[@style='cursor: pointer;]"));
	        		Actions ob=new Actions(driver);
	        ob.contextClick(picture);

	}

}
