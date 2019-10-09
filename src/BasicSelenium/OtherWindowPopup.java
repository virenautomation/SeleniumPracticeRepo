package BasicSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OtherWindowPopup {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.autoitscript.com/site/autoit/downloads/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='post-77']/div/table[2]/tbody/tr[1]/td[2]/a/img"));
		try
		{
			Runtime.getRuntime().exec("D:\\Study\\Selenium\\Sci.exe");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
