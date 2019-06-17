import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	

 @Test(priority=1)
  public void menu() {
	driver.get("http://localhost:8080/httpsessionlogin/");
	
		WebElement button = driver.findElement(By.linkText("Login"));
		button.click();
		   try {
		    	Thread.sleep(3000);
		    }catch(Exception e){
		    	
		    }
  }
 
  @Test(priority=2)
  public void login() {

	    try {
	    	Thread.sleep(3000);
	    }catch(Exception e){
	    	
	    }
	    
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("XYZ");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		WebElement button = driver.findElement(By.cssSelector("input[type='submit']"));
		button.click();
	  
		  try {
		    	Thread.sleep(3000);
		    }catch(Exception e){
		    	
		    }
		  
		String url = driver.getPageSource();
		System.out.println(url.contains("Welcome,"));
	///	Assert.assertEquals(url.contains("Welcome,"), "true");
		Assert.assertTrue(url.contains("Welcome,"));
		
	  try {
	    	Thread.sleep(3000);
	    }catch(Exception e){
	    	
	    }
		  
		
	}
  
  @Test(priority=3)
  public void logout() {

	  WebElement button = driver.findElement(By.linkText("Logout"));
	  button.click();
		
		//String url = driver.getCurrentUrl();
		//Assert.assertEquals(url, "LogoutServlet");
		
		String url = driver.getPageSource();
		Assert.assertTrue(url.contains("You are successfully logged out!"));
		
	}
  
  @BeforeClass
  public void beforeClass() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dac\\Videos\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("init driver");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("Give me full marks");
  }

}
