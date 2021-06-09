package programs;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Question1 {
	
	WebDriver driver = null;
	Set<String> duplicates = new HashSet();

@org.testng.annotations.Parameters("browser")
  @Test
  public void f(String browser) throws InterruptedException {
	if(browser.equals("chrome")) {
		driver = new ChromeDriver();
	}else if(browser.equals("mozilla")) {
		driver = new FirefoxDriver();
	}
	 
		Actions action = new Actions(driver);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://mayexam.cpsatexam.org/");
	//  driver.switchTo().frame(1);
	
	  driver.findElement(By.xpath("//*[@id=\"elementor-popup-modal-12373\"]/div/div[4]/i")).click();
	  driver.findElement(By.xpath("//*[@id=\"menu-main-1\"]/li[11]/a")).click();
	  String emailID = driver.findElement(By.xpath("//*[@id=\"post-345\"]/div/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div/div[2]/p/a")).getText();
	  System.out.println("EmailID-----"+emailID);
	  String phoneNumber = driver.findElement(By.xpath("//*[@id=\"post-345\"]/div/div/div/div/div/section[2]/div/div/div/div/div/div[3]/div/div/div[2]/p/a")).getText();
	  //float number = (float) Integer.parseInt(phoneNumber.substring(phoneNumber.indexOf("-")+1));
	  String phone = phoneNumber.substring(phoneNumber.indexOf("-")+1).trim();
	  System.out.println("PhoneNumber-------"+phone);
	  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"wpforms-form-129\"]/div[4]/img")));
	  String secondPhone = driver.findElement(By.xpath("//*[@id=\"custom_html-3\"]/div/div[2]/div[1]/p")).getText();
	  String secondNumber = secondPhone.substring(secondPhone.indexOf(" ")+1).trim();
	  String secondEmail = driver.findElement(By.xpath("//*[@id=\"custom_html-3\"]/div/div[2]/div[2]/p/a")).getText();
	  Assert.assertEquals(secondNumber, phone, "Phone Numbers are equal");
	  Assert.assertEquals(secondEmail, emailID, "EmailIDs are same");
	  
	  driver.findElement(By.xpath("//*[@id=\"custom_html-3\"]/div/div[1]/a[1]/i")).click();
	  switching();
	  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"wpforms-form-129\"]/div[4]/img")));
	  driver.findElement(By.xpath("//*[@id=\"custom_html-3\"]/div/div[1]/a[2]/i")).click();
	  switching();
	  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"wpforms-form-129\"]/div[4]/img")));
	  driver.findElement(By.xpath("//*[@id=\"custom_html-3\"]/div/div[1]/a[3]/i")).click();
	  switching();
	  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"wpforms-form-129\"]/div[4]/img")));
	  driver.findElement(By.xpath("//*[@id=\"custom_html-3\"]/div/div[1]/a[4]/i")).click();
	  switching();
	  driver.quit();
  }
  
  public void switching() throws InterruptedException {
	  Set<String> s = driver.getWindowHandles();
	  if(duplicates.size()>0)
		  s.removeAll(duplicates);
	  String current = driver.getWindowHandle();
	  for(String name : s) {
		  if(!name.equalsIgnoreCase(current)) {
			  driver.switchTo().window(name);
			  Thread.sleep(5000);
			  System.out.println("Social Media Title---"+driver.getTitle());
			  driver.switchTo().window(current);
			  duplicates.add(name);
		  }
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
