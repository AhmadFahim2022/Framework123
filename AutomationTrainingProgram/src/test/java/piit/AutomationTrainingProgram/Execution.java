package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Execution {
	
  WebDriver driver;
	@Test//5
  public void f(Object Screenshots) {
	  System.out.println("This is test annotation");
	  
	//  File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//  FileHandler.copy(Screenshots, new File("")
	  
  }
  

  

  @BeforeClass//3
  public void beforeClass() {
	Browsers("Chrome");
	
  }	
			 @AfterClass
			  public void afterClass() {
				 driver.close(); 
			 }
				 public void Browsers(String window) {
				 if(window.equalsIgnoreCase("chrome")) {
					 System.setProperty("webdriver.chrome.driver","C:\\Users\\fahim\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\geckodriver.exe");
					 driver=new FirefoxDriver();
						driver.navigate().to("https://www.facebook.com");
						driver.manage().window().maximize();
				 }
						
			/*	 }else if(window.equalsIgnoreCase("Edge")) {
				  System.setProperty("webdriver.Edge.driver","C:\\Users\\fahim\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\msedgedriver.exe");
				  driver=new FirefoxDriver();
			    	driver.navigate().to("https://www.facebook.com");
					driver.manage().window().maximize();
									
         
		/*		 }else if(window.equalsIgnoreCase("Firefox")) {
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\fahim\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.navigate().to("https://www.facebook.com");
		   	driver.manage().window().maximize();}*/
				 
				 
			
				
			  
  

				 }
  @BeforeTest//2
  public void beforeTest() {
	  System.out.println("This is before method  annotation");
  }

  @AfterTest//8
  public void afterTest() {
	  System.out.println("This is after method annotation");
  }

  @BeforeSuite//1
  public void beforeSuite() {
	  System.out.println("This is before method  annotation");
  }

  @AfterSuite//9
  public void afterSuite(Object driver) {
	  System.out.println("This is after method annotation");
	 // System.setProperty("webdriver.chrome.driver","C:\\Users\\fahim\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\msedgedriver.exe");
	  
	  
	  	
		
  }

}
