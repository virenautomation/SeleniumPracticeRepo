package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmMall 
{
public static void main(String[] args)
{
	System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://paytmmall.com/");
//	driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[2]/div[3]/div[3]/div")).click();
	WebElement wb = driver.findElement(By.id("searchInput"));
	wb.sendKeys("Casual shoes");
	wb.sendKeys(Keys.ENTER);
}
}


