package se03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class J_03_Navigation_Methods {

	public static void main(String[] args) {
		WebDriver driver;

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.navigate().back();

		if (driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		driver.navigate().forward();

		if (driver.getTitle().equals("OrangeHRM")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		driver.navigate().refresh();

		driver.quit();
	}

}
