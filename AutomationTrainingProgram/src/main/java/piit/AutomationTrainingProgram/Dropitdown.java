package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropitdown {
	private static final String CreadeAnAccount = null;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	//  Todo Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fahim\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
			driver.navigate().to("https://www.facebook.com");
	        driver.manage().window().maximize();
	        WebElement CreateAnAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
	        CreateAnAccount.click();
	        Thread.sleep(6000);
	        WebElement month=driver.findElement(By.xpath("//*[text()='Create new account']"));
	        Select  ob=new Select(month);
	        ob.deselectByValue("6");
	       // WebElement day=driver.findElement(by.name("birthday_month"));
	        		

	}

}
