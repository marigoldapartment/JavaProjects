package programs;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3 extends Question3POM {
	WebDriver driver = new ChromeDriver();
	Actions action = new Actions(driver);
	@Before
	public void setUp() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.get("https://mayexam.cpsatexam.org/about-speakers/");
		driver.findElement(By.xpath("//*[@id=\"menu-main-1\"]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-main-1\"]/li[3]/ul/li[2]/a")).click();
		System.out.println(GetPageTitle(driver));
		System.out.println(getSpeakerDetails("Masa K Maeda", driver));
		System.out.println(getSpeakerDetails("Khimanand Upreti ", driver));
		System.out.println(getSpeakerDetails("Omar Fernandez", driver));
	}

}
