package se04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class J_03_Explicit_Wait {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverWait explicitWait;

		driver = new FirefoxDriver();
		explicitWait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.manage().window().maximize();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));

		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));

		driver.quit();
	}

}
