package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Question3POM {
	
	public String GetPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	public String getSpeakerDetails(String name, WebDriver driver) {
		String s="";
		String xpath = "//td[text()='"+name+"']/following-sibling::td[1]";
		s = s + driver.findElement(By.xpath(xpath)).getText();
		xpath = "//td[text()='"+name+"']/following-sibling::td[2]/a";
		s = s + "ATAMyStory:"+driver.findElement(By.xpath(xpath)).getAttribute("href");
		xpath = "//td[text()='"+name+"']/following-sibling::td[3]/a";
		s = s + "Video Interview:"+driver.findElement(By.xpath(xpath)).getAttribute("href");
		return s;
	}

}
