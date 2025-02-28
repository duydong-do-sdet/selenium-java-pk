package se02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S_03_By_XPath {

	public static void main(String[] args) {
		WebDriver driver;

		driver = new FirefoxDriver();

		driver.get("https://demo.opencart.com/");

		driver.findElement(By.xpath("//*[text()='MacBook']/parent::h4/following-sibling::div/span[starts-with(text(),'$')]"));

		driver.quit();
	}

}
