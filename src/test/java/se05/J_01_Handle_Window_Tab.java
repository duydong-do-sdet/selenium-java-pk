package se05;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class J_01_Handle_Window_Tab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String currentId = driver.getWindowHandle();
		String currentTitle = driver.getTitle();

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		Set<String> allWindowIds = driver.getWindowHandles();

		// Switch by current id
		for (String id : allWindowIds) {
			if (!id.equals(currentId)) {
				driver.switchTo().window(id);
				break;
			}
		}

		driver.findElement(By.xpath("//input[@name='EmailHomePage']")).sendKeys("dongsdet@gmail.com");
		Thread.sleep(1000);

		// Switch by expected title
		for (String id : allWindowIds) {
			driver.switchTo().window(id);
			if (driver.getTitle().equals(currentTitle)) {
				break;
			}
		}

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Dong");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Selenium");
		Thread.sleep(1000);

		// Close all windows except expected id
		for (String id : allWindowIds) {
			if (!id.equals(currentId)) {
				driver.switchTo().window(id);
				Thread.sleep(1000);
				driver.close();
			}
		}
		driver.switchTo().window(currentId);
		Thread.sleep(1000);

		driver.quit();
	}

}
