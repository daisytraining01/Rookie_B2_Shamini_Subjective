package Dese;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;
import java.net.MalformedURLException;
import java.net.URL;
 
/*import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;*/
 
 
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Activity6 {


			

			
	    public static void main(String[] args) {									
	    		
	    	// declaration and instantiation of objects/variables		
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\CucumberTest\\src\\main\\resources\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();					
	        		
	        String baseUrl = "http://demo.guru99.com/test/login.html";					
	        driver.get(baseUrl);					

	        // Get the WebElement corresponding to the Email Address(TextField)		
	        WebElement email = driver.findElement(By.id("email"));							

	        // Get the WebElement corresponding to the Password Field		
	        WebElement password = driver.findElement(By.name("passwd"));							

	        email.sendKeys("abcd@gmail.com");					
	        password.sendKeys("abcdefghlkjl");					
	        System.out.println("Text Field Set");					
	         
	        // Deleting values in the text box		
	        email.clear();			
	        password.clear();			
	        System.out.println("Text Field Cleared");					

	        // Find the submit button		
	        WebElement login = driver.findElement(By.id("SubmitLogin"));							
	                    		
	        // Using click method to submit form		
	        email.sendKeys("abcd@gmail.com");					
	        password.sendKeys("abcdefghlkjl");					
	        login.click();			
	        System.out.println("Login Done with Click");					
	        		
	        //using submit method to submit the form. Submit used on password field		
	        driver.get(baseUrl);					
	        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");							
	        driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");							
	        driver.findElement(By.id("SubmitLogin")).submit();					
	        System.out.println("Login Done with Submit");					
	         
			//driver.close();		
	        		
	    }		
	}


}
