import org.openqa.selenium.By ;
import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.firefox.FirefoxDriver ;
import org.openqa.selenium.support.ui.ExpectedConditions ;
import org.openqa.selenium.support.ui.WebDriverWait ;

public class Example1 {

	public static void main(String[] args) {
		
		// open up Firefox and navigate to Google, must set path to geckodriver
		WebDriver driver ;
		System.setProperty("webdriver.gecko.driver",
				"/Users/jgower/testing-workspace/libs/geckodriver") ;
		driver = new FirefoxDriver() ;
		driver.get("http://www.google.com") ; 
		System.out.println(driver.getCurrentUrl()) ;
		
		// search Google for Pluralsight
		WebElement searchBox = driver.findElement(By.name("q")) ;
		searchBox.sendKeys("pluralsight") ;
		// "Google Search" box moves, so pause and make sure visible before clicking
		WebDriverWait wait = new WebDriverWait(driver, 3) ;
		WebElement submitBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK"))) ;
		submitBox.click() ;
		System.out.println(driver.getCurrentUrl()) ;
		
		// click Images
		WebElement imagesLink = driver.findElement(By.linkText("Images")) ;
		imagesLink.click() ;
		System.out.println(driver.getCurrentUrl()) ;
		
		// click on first image
		WebElement firstImage = driver.findElement(By.xpath("//*[@id=\"S3_A4SCQnV83UM:\"]")) ;
		firstImage.click() ;
		System.out.println(driver.getCurrentUrl()) ;
	}
}