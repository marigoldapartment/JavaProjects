package programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question4 {
	WebDriver driver = new ChromeDriver();
	Actions action = new Actions(driver);
  @Test
  public void f() {
	  driver.get("https://mayexam.cpsatexam.org/news/");
	  for(int i=0;i<6;i++) {
		  List<WebElement> list = driver.findElements(By.xpath("//article/a"));
		  for(WebElement e : list) {
			  System.out.println(e.getAttribute("href"));
		  }
		  
		driver.findElement(By.xpath("//*[@id=\"post-477\"]/div/div/div/div/div/section[2]/div/div/div/div/div/div/div/nav/a[6]")).click();
				
	  }
	  List<WebElement> list = driver.findElements(By.xpath("//article/a"));
	  for(WebElement e : list) {
		  System.out.println(e.getAttribute("href"));
	  }
	  
	  driver.findElement(By.xpath("//*[@id=\"menu-main-1\"]/li[9]/a")).click();
	  System.out.println(driver.findElement(By.xpath("//*[@id=\"post-342\"]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div[2]/div/button")).isEnabled());
       driver.findElement(By.xpath("//*[@id=\"post-342\"]/div/div/div/div/div/section[4]/div/div/div[4]/div/div/div[2]/div/button")).click();
       
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
