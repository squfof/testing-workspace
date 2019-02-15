import java.net.MalformedURLException ;
import java.net.URL ;
import org.openqa.selenium.By ;
import org.openqa.selenium.JavascriptExecutor ;
import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.remote.DesiredCapabilities ;
import org.openqa.selenium.remote.RemoteWebDriver ;

public class GoToProjectEulerWithLocalSeleniumServer {
	
	public static void main(String[] args) throws MalformedURLException {
		
		// Use Selenium server on local machine to open up specified browser.
		URL url = new URL("http://127.0.0.1:4444/wd/hub") ;
		DesiredCapabilities capabilities = new DesiredCapabilities() ;
		capabilities.setBrowserName("safari") ; // "chrome" or "safari" or "firefox"
		WebDriver driver = new RemoteWebDriver(url, capabilities) ;
		
		// Navigate to Project Euler and maximize.
		driver.get("http://www.projecteuler.net") ;
		wait3Seconds() ;
		driver.manage().window().maximize() ;		
		System.out.println(driver.getCurrentUrl()) ;
		wait3Seconds() ;
		
		// Click on the "Problems" link.
		WebElement problemsLink = driver.findElement(By.linkText("Problems"));
		problemsLink.click();
		System.out.println(driver.getCurrentUrl());
		wait3Seconds() ;
		
		// Click on the Collatz problem.
		WebElement collatzLink = driver.findElement(By.partialLinkText("Collatz"));
		// Element is obscured, so need the following bit of code to click it.
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", collatzLink);		
		System.out.println(driver.getCurrentUrl());
	}
	
	private static void wait3Seconds() {
		try {
			Thread.sleep(3000) ;
		}
		catch (Exception e) {
			System.out.println("Oops: " + e.getMessage()) ;
		}
	}
}