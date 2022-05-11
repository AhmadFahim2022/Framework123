package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

    public class KeyToFunction { 
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//TODO Auto-generated method stub 
		
	//tem.setProperty("webdriver.chrome.driver","C:\\Users\\fahim\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
    // *  driver.manage().window().maximize();
  //    Webelment searchtofield=driver.findElement(By.id(null));
  //    searchfield.sendkeys("computer");
   //   Actions ob=new Actions(driver);
   //   ob.keydown(Keys.ConTrol).sendkeys("a").build().perform();
        Thread.sleep(6000);
   //   ob.keydown(Keys.ConTrol).sendkeys("a").build().perform();
   //   *//
}
}