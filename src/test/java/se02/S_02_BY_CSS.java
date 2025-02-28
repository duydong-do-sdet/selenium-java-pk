package se02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S_02_BY_CSS {

	public static void main(String[] args) {
		WebDriver driver;

		driver = new FirefoxDriver();

		driver.get("https://demo.opencart.com/");

		driver.findElement(By.cssSelector("#logo"));
		driver.findElement(By.cssSelector("div#logo"));
		driver.findElement(By.cssSelector("div[id='logo']"));

		driver.findElement(By.cssSelector(".navbar-nav"));
		driver.findElement(By.cssSelector("ul.navbar-nav"));
		driver.findElement(By.cssSelector("ul[class='nav navbar-nav']"));

		driver.quit();
	}

}
