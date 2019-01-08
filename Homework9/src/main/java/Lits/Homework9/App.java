package Lits.Homework9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws InterruptedException {
		// Setup browser driver
		//System.setProperty("webdriver.chrome.driver", "bin\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		//Instantiate WebDriver instance
		WebDriver driver = new ChromeDriver();
		
		//Navigate page
		driver.get("https://google.com.ua");
		// Find element...
		WebElement inputString = driver.findElement(By.name("q"));
		//... and type into it
		inputString.sendKeys("Lits");
		Thread.sleep(2000);
		inputString.sendKeys(Keys.ESCAPE);
		System.out.println(inputString.getTagName());

		// Find element...
		By by = By.name("btnK");
		WebElement button = driver.findElements(by).get(1);
		
		System.out.println(button.getAttribute("value"));
		
		// ...and click on it
		button.click();
		
		// close browser
		driver.quit();

	}

}