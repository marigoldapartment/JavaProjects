package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass {
	
	public void takeScreenshot(WebDriver driver) throws IOException {
		TakesScreenshot screen = ((TakesScreenshot) driver);
		File src = screen.getScreenshotAs(OutputType.FILE);
		File destination = new File("E://Screenshot-Question2.JPG");
		FileUtils.copyFile(src, destination);
	}
	
	public Sheet ExcelReading(String filepath) throws IOException {
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		return sh;
		
	}

}
