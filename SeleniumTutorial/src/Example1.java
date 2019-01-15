import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {

	public static void main(String[] args) {
		
		// open up Firefox and navigate to Google
		// must set path to geckodriver
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"/Users/jgower/eclipse-workspace/libs/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		System.out.println(driver.getCurrentUrl());
		
		// search Google for Pluralsight
		WebElement searchBox = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input"));
		//WebElement searchBox = driver.findElement(By.id("submit"));
		searchBox.sendKeys("pluralsight");
		WebElement submitBox = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[3]/center/input[1]"));
		submitBox.click();
		
		System.out.println(driver.getCurrentUrl());
		
		// click Images
		WebElement imagesLink = driver.findElement(By.linkText("Images"));
		imagesLink.click();
		
		System.out.println(driver.getCurrentUrl());
		
		// click on first image
		WebElement firstImage = driver.findElement(By.xpath("//*[@id=\"S3_A4SCQnV83UM:\"]"));
		firstImage.click();
		
		System.out.println(driver.getCurrentUrl());
	}
}