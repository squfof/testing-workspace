
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	
	@Test
	public void site_header_is_on_home_page() {  
		
		// Use Firefox to navigate to saucelabs.com
		// Firefox's geckodriver requires you to specify its path.
		WebDriver browser;
		System.setProperty("webdriver.gecko.driver","/Users/jgower/eclipse-workspace/libs/geckodriver");   
		browser = new FirefoxDriver();
		browser.get("http://saucelabs.com");   
		
		WebElement header = browser.findElement(By.id("site-header"));   
		assertTrue((header.isDisplayed()));
	}
}