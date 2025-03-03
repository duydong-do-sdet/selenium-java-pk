package se04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class J_04_Fluent_Wait {

	public static void main(String[] args) {
		WebDriver driver;

		driver = new FirefoxDriver();

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);

		driver.manage().window().maximize();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement username = fluentWait.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver input) {
				return driver.findElement(By.xpath("//input[@name='username']"));
			}
		});

		WebElement password = fluentWait.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver input) {
				return driver.findElement(By.xpath("//input[@name='password']"));
			}
		});

		if (username.isDisplayed() && password.isDisplayed()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		driver.quit();
	}

}
