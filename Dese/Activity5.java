package Dese;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity5 {

	public static void main(String[] args){
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\training\\Downloads\\AutomationTesting\\src\\main\\resources\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	 
	 
	 driver.get("https://wordpress.com/?aff=58022&cid=8348279\r\n"
	 		+ "");
	 driver.manage().window().maximize();
	 
	 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	 
	 
	 for(WebElement link:allLinks){
	 System.out.println(link.getText() + " - " + link.getAttribute("href"));
	 }
	 

	   driver.quit();

}
}
