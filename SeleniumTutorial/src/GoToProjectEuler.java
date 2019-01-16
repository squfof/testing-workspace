import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoToProjectEuler {
	public static void main(String[] args) {
	
		// open up Firefox and navigate to Project Euler home page
		// must set path to geckodriver
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"/Users/jgower/testing-workspace/libs/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://www.projecteuler.net");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		// click on the Problems link
		WebElement problemsLink = driver.findElement(By.linkText("Problems"));
		problemsLink.click();
		
		System.out.println(driver.getCurrentUrl());
		
		// click on the Collatz problem
		WebElement collatzLink = driver.findElement(By.partialLinkText("Collatz"));
		// element is obscured, so need the following bit of code to click it
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", collatzLink);
				
		System.out.println(driver.getCurrentUrl());
	}
}
