package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadPopup {

	public static void main(String[] args) 
{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/portal-jobs");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement wb = driver.findElement(By.xpath("//*[@id='input_resumeParser']"));
		wb.click();
		wb.sendKeys("V:\\Personal\\Document\\Resume\\Others_Resume\\Mukesh Sharma_resume.docx");
		
		
//		driver.quit();

	}

}
