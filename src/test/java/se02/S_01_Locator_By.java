package se02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S_01_Locator_By {

	public static void main(String[] args) {
		WebDriver driver;

		driver = new FirefoxDriver();

		driver.get("https://demo.opencart.com/");

		driver.findElement(By.id("logo"));

		driver.findElement(By.className("navbar-nav"));

		driver.findElement(By.name("search"));

		driver.findElements(By.tagName("input"));

		driver.findElement(By.linkText("My Account"));

		driver.findElement(By.partialLinkText("y Acc"));

		driver.quit();
	}

}
