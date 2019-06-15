import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dac\\Videos\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

//		String title = driver.getTitle();
//		System.out.println(title);
		
/*		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));
		WebElement submit = driver.findElement(By.id("u_0_3"));

		email.sendKeys("mazhaemail@tuzhaemail.com");
		password.sendKeys("konachPassword");
		submit.submit();
*/
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("naav");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("adnav");
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("97322323");
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("97322323");
		
		
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("9");
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Apr");
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByIndex(10);
		
	    WebElement sex = driver.findElement(By.id("u_0_9"));
	    sex.click();
	    
	    WebElement button = driver.findElement(By.name("websubmit"));
	    button.click();

		String text = driver.findElement(By.id("js_be")).getText();
		System.out.println("Erro :" + text);
	    

	}

}
