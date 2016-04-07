package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class one {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", 
	               "/home/sushant/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Lipika");
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("resultStats")).getText());
		System.out.println(driver.getTitle());
		driver.close();
	}
}
