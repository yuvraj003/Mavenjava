package qaclickacademy;


import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC1Test 
{
	@Test
	public void Testcase1() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\eclipse\\Chrome EXE file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		WebElement Signin = driver.findElement(By.xpath("//tp-yt-paper-button[@aria-label = 'Sign in']"));
		Signin.click();
		
		WebElement Email = driver.findElement(By.xpath("//input[@aria-label = 'Email or phone']"));
		Email.sendKeys("chilanayuvraj@gmail.com");
		
		WebElement Next = driver.findElement(By.xpath("//span[text() = 'Next']"));
		Next.click();
		
		Thread.sleep(3000);
		
		WebElement Password = driver.findElement(By.xpath("//input[@aria-label = 'Enter your password']"));
		Password.sendKeys("shubham748596"); 
		
		Thread.sleep(3000);

		WebElement Next2 = driver.findElement(By.xpath("//span[text() = 'Next']"));
		Next2.click();
		
		Thread.sleep(3000);
		
		WebElement Explore = driver.findElement(By.xpath("//yt-formatted-string[text()='Explore']"));
		Explore.click();
		
		Thread.sleep(3000);
		
		WebElement Trending = driver.findElement(By.xpath("//yt-formatted-string[text()='Trending']")); 
		Trending.click();
		
		Thread.sleep(5000);

		WebElement Profile = driver.findElement(By.xpath("//*[@id='img']"));
		Profile.click();
		
		driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
		
		driver.quit();
	}

}
