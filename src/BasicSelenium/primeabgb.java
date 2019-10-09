package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class primeabgb {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.primeabgb.com/");
	
	//Handling Mouse hover
	WebElement wb = driver.findElement(By.xpath("//*[@id=\"menu-item-8846\"]/a"));
	Actions act = new Actions(driver);
	act.moveToElement(wb).build().perform();
	wb.click();
	driver.findElement(By.xpath("//*[@id=\"menu-item-8801\"]/a")).click();
	
	//Handling Range Slider
	WebElement wb1 = driver.findElement(By.xpath("//*[@id=\"berocket_aapf_single-5\"]/div/ul/li/div/div/span[2]"));
	act.clickAndHold(wb1).perform();
	act.moveByOffset(-10, 0).perform();
	act.release(wb1).perform();	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//Handling scroll bar 
//	JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("window.scrollBy(0,500)", "");
	
//	driver.quit();
	
	//New Website host under one main method And Handling browser popup
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
	driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[2]/p-growl/div/div/div/div[1]")).click();

	//Handling Popup Alert
//	Alert alt = driver1.switchTo().alert();
//	String altText = alt.getText();
//	System.out.println(altText);
//	alt.dismiss();
	
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--disable-notifications");
//	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//	WebDriver driver1 = new ChromeDriver(options);
	
	}

}
