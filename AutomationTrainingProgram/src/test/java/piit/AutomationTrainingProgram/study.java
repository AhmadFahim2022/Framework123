package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class study {

	public static void main(String[] args) throws InterruptedException {
		
		testPizzaOrder();
		testPizzahutPageTitle();
        
	}
	
	public static void testPizzaOrder()  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fahim\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.pizzahut.com/");
		driver.findElement(By.xpath("//*[@class='MuiButton-label']")).click();
		driver.findElement(By.xpath("(//*[@class='jss10'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='btn btn-lg btn-link ph-titlecase ng-binding ng-scope'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='btn btn-primary btnModal'])[1]")).click();
		//driver.findElement(By.className("btn btn-primary btnModal")).click();
		
		
		
		
		Thread.sleep(10000);
		driver.quit();
		
	}
	
	public static void testPizzahutPageTitle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fahim\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.pizzahut.com/");
		String title = driver.getTitle();
		
		if (title.equals("Pizza Hut: Pizza Delivery | Pizza Carryout | Coupons | Wings & More |Awesome Pizza")) {
			System.out.println("Test Report: Title of the page is correct");
		} else {
			System.out.println("Test Report: Title of the page is not correct");
		}
		
		System.out.println(title);
		
		
		
		
		
		Thread.sleep(10000);
	//	driver.quit();*/
		
	}
	
	

}
