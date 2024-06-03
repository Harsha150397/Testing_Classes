package AQAclass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;

public class A1_Alerts {
	
	public WebDriver driver;
	
  @Test
  public void handlingalerts() throws Exception {
	  
	//click on click me button
			driver.findElement(By.id("alertButton")).click();
			
			String str = driver.switchTo().alert().getText();
			System.out.println(str);

			Thread.sleep(2000);

		     //handling alert
			 driver.switchTo().alert().accept();
			 
				/*
				 * //timelimit syncronisation Thread.sleep(3000);
				 * 
				 * //Implicitly wait: Sets the Time limit throughout of the program.
				 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				 * 
				 * 
				 * // Explicitly Wait: Sets the Time limit for Particular Instance.
				 * WebDriverWait wait = new WebDriverWait(driver, 30);
				 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				 * "//div[contains(text(),'COMPOSE')]")));
				 */
	 
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  //ld code.
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Charvik\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriverManager.safaridriver().setup();
	  driver = new SafariDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
