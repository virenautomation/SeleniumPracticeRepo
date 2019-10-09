package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupHandling {

	public static void main(String[] args)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver(options);
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.get("https://www.irctc.co.in/nget/train-search");
		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver1.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[7]/button")).click();
		driver1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver1.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[2]/p-growl/div/div/div/div[1]")).click();

		//Handling Popup Alert
//		Alert alt = driver1.switchTo().alert();
//		String altText = alt.getText();
//		System.out.println(altText);
//		alt.dismiss();
	}

}
