import java.net.MalformedURLException ;
import java.net.URL ;
import org.openqa.selenium.By ;
import org.openqa.selenium.JavascriptExecutor ;
import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.remote.DesiredCapabilities ;
import org.openqa.selenium.remote.RemoteWebDriver ;
import org.openqa.selenium.support.ui.ExpectedConditions ;
import org.openqa.selenium.support.ui.WebDriverWait ;

public class GoToProjectEulerWithGridSeleniumServer {
	
	public static void main(String[] args) throws MalformedURLException {
	
		// Use remote Selenium server in grid with specified browser.
		URL url = new URL("http://192.168.0.42:4444/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities() ;
		capabilities.setBrowserName("safari") ; // "chrome" or "safari" or "firefox"
		WebDriver driver = new RemoteWebDriver(url, capabilities) ;
		
		// Navigate to Project Euler and maximize.
		driver.get("http://www.projecteuler.net");
		wait3Seconds() ;
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		wait3Seconds() ;
	
		// click on the Problems link, some browsers seem to need a pause before clicking		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement problemsLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Problems")));
		problemsLink.click();
		System.out.println(driver.getCurrentUrl());
		wait3Seconds() ;
	
		// click on the Collatz problem
		// some browsers like the first definition of collatzLink, others like the second
		WebElement collatzLink = driver.findElement(By.partialLinkText("Collatz"));
		//WebElement collatzLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Collatz")));
		// element is obscured, so need the following bit of code to click it
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