import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2 {

	public static void main(String[] args) {
		
		// SETUP
		//
		// Setup drive and navigate to local page
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"/Users/jgower/eclipse-workspace/libs/geckodriver");
		driver = new FirefoxDriver();
		driver.get("file:///Users/jgower/eclipse-workspace/SeleniumTutorial/src/page.html");
		
		// RADIO BUTTON TEST
		//
		// get radio buttons, select one, then check to see which button is selected
		int idx = 1;
		List<WebElement> radioButtons = driver.findElements(By.name("color"));
		radioButtons.get(idx).click();
		for (WebElement webelem : radioButtons) {
			if (webelem.isSelected())
				System.out.println("The '" + webelem.getAttribute("value") + "' button is selected.");
		}
		
		// CHECK BOX TEST
		//
		// get check boxes, select one, then check to see which box is selected
		idx = 0;
		List<WebElement> checkBoxes = driver.findElements(By.name("check"));
		checkBoxes.get(idx).click();
		for (WebElement webelem : checkBoxes) {
			if (webelem.isSelected())
				System.out.println("The '" + webelem.getAttribute("value") + "' box is selected.");
		}
		
		// DROP-DOWN LIST TEST
		//
		// get list, select an item, then check to see which item is selected
		String tree = "Maple";
		WebElement dropDown = driver.findElement(By.id("select1"));
		Select select = new Select(dropDown);
		select.selectByVisibleText(tree);
		System.out.println("The '" + select.getFirstSelectedOption().getAttribute("value") 
				+ "' tree is selected.");
		
		// NESTED TABLE ACCESS TEST
		//
		// get second row of second column using tags and print text
		WebElement outerTable = driver.findElement(By.tagName("table"));
		WebElement innerTable = outerTable.findElement(By.tagName("table"));
		WebElement secondRow = innerTable.findElements(By.tagName("td")).get(1);
		System.out.println(secondRow.getText());
		//
		// get the first row of the second column using xpath and print text
		String xPath = "/html/body/table/tbody/tr/td[2]/table/tbody/tr[1]/td";
		WebElement firstRow = driver.findElement(By.xpath(xPath));
		System.out.println(firstRow.getText());
	}
}
