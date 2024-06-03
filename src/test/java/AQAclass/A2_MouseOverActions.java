package AQAclass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;

public class A2_MouseOverActions {
	
	public WebDriver driver;
	public Actions action;
	
  @Test
  public void mouseOvver() throws Exception {
	  
	  action = new Actions(driver);
	  
		 WebElement ele1 = driver.findElement(By.linkText("SwitchTo"));
		
		//Action command
		action.moveToElement(ele1).build().perform();
	  Thread.sleep(3000);
	  
	driver.findElement(By.linkText("Windows")).click();

	Thread.sleep(3000);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
	  driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
