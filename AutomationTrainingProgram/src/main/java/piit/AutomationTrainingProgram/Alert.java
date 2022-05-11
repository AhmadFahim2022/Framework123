package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {
	static WebDriver driver;
	    public static void main(String[] args) throws InterruptedException {
	        //  Todo Auto-generated method stub
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\fahim\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	        driver.manage().window().maximize();
	        WebElement Alert=driver.findElement(By.name("alert"));
	        Alert.click();
	        Thread.sleep(6000);
	        driver.switchTo().alert().accept();
	}

}
