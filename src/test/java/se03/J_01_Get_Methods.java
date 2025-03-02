package se03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class J_01_Get_Methods {

	public static void main(String[] args) {
		WebDriver driver;

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("Url: " + driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		System.out.println("Title: " + driver.getTitle());

		System.out.println("ID: " + driver.getWindowHandle());

		System.out.println("IDs: " + driver.getWindowHandles());

		driver.quit();
	}

}
