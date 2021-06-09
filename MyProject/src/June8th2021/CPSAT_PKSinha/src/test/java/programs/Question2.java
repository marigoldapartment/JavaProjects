package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question2 extends UtilityClass{
	WebDriver driver = new ChromeDriver();
	Actions action = new Actions(driver);
	
	@Test
	public void f() throws IOException {
		driver.get("https://mayexam.cpsatexam.org/");
		driver.findElement(By.xpath("//*[@id=\"elementor-popup-modal-12373\"]/div/div[4]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-main-1\"]/li[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-main-1\"]/li[6]/ul/li[1]/a")).click();
		takeScreenshot(driver);
		Sheet sh = ExcelReading("E:\\Question2.xlsx");
		
		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
		for (int i = 1; i < rowCount + 1; i++) {
			Row r = sh.getRow(i);
			int j = 0;
			while(!driver.findElement(By.id("wpforms-129-field_1")).getAttribute("value").equals("")) {
				driver.findElement(By.id("wpforms-129-field_1")).sendKeys(Keys.BACK_SPACE);
			}
			
			driver.findElement(By.id("wpforms-129-field_1")).sendKeys(r.getCell(j++).getStringCellValue());
			while(!driver.findElement(By.id("wpforms-129-field_2")).getAttribute("value").equals("")) {
				driver.findElement(By.id("wpforms-129-field_2")).sendKeys(Keys.BACK_SPACE);
			}
			driver.findElement(By.id("wpforms-129-field_2")).sendKeys(r.getCell(j++).getStringCellValue());
			while(!driver.findElement(By.id("wpforms-129-field_3")).getAttribute("value").equals("")) {
				driver.findElement(By.id("wpforms-129-field_3")).sendKeys(Keys.BACK_SPACE);
			}
			driver.findElement(By.id("wpforms-129-field_3")).sendKeys("" + r.getCell(j++).getNumericCellValue());
			while(!driver.findElement(By.id("wpforms-129-field_4")).getAttribute("value").equals("")) {
				driver.findElement(By.id("wpforms-129-field_4")).sendKeys(Keys.BACK_SPACE);
			}
			
			driver.findElement(By.id("wpforms-129-field_4")).sendKeys(r.getCell(j++).getStringCellValue());
			driver.findElement(By.xpath("//*[@id=\"wpforms-submit-129\"]")).click();
			try {
			driver.findElement(By.xpath("//label[text()='This field is required.']"));
			r.createCell(j).setCellValue("fail");
			}	catch(Exception e) {
				r.createCell(j).setCellValue("Pass");
			}
		}

	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void afterMethod() {
	}

}
