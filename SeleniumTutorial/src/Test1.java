import static org.junit.jupiter.api.Assertions.assertEquals ;
import org.junit.jupiter.api.Test ;
import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.firefox.FirefoxDriver ;

public class Test1 {
	
	@Test
	public void site_header_is_on_home_page() {  
		
		// open up Firefox and navigate to saucelabs.com
		// Firefox's geckodriver requires that you to specify its path
		WebDriver browser ;
		System.setProperty("webdriver.gecko.driver","/Users/jgower/testing-workspace/libs/geckodriver") ;   
		browser = new FirefoxDriver() ;
		
		browser.get("http://saucelabs.com/") ; 
		
		assertEquals("http://saucelabs.com/", browser.getCurrentUrl(),
				"Should be at 'http://saucelabs.com/'") ;
	}
}