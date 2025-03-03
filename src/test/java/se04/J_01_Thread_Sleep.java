package se04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class J_01_Thread_Sleep {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='username']"));

		driver.findElement(By.xpath("//input[@name='password']"));

		driver.quit();
	}

}
