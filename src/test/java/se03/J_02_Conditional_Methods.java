package se03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class J_02_Conditional_Methods {

	public static void main(String[] args) {
		WebDriver driver;

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement element = driver.findElement(By.xpath("//input[@id='email']"));

		// element.isEnabled();
		// element.isSelected();
		if (element.isDisplayed()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		driver.quit();
	}

}
