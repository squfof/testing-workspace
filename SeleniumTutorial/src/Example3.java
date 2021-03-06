import java.net.MalformedURLException ;
import java.net.URL ;
import org.openqa.selenium.By ;
import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.remote.DesiredCapabilities ;
import org.openqa.selenium.remote.RemoteWebDriver ;

public class Example3 {

	public static void main(String[] args) throws MalformedURLException {
		
		// use Selenium server on local machine to open up Firefox and navigate to Google
		URL url = new URL("http://127.0.0.1:4444/wd/hub") ;
		DesiredCapabilities capabilities = new DesiredCapabilities() ;
		capabilities.setBrowserName("firefox") ;
		WebDriver driver = new RemoteWebDriver(url, capabilities) ;
		driver.get("http://www.google.com") ;
		System.out.println(driver.getCurrentUrl()) ;
		
		// search Google for Pluralsight
		WebElement searchBox = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")) ;
		searchBox.sendKeys("pluralsight") ;
		WebElement submitBox = driver.findElement(By.name("btnK")) ;
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