package BasicSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumLearning 
{
	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Software\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//How to get the Title of the application
		String title = driver.getTitle();
		System.out.println("The Application Title is " + title);
		
		//Mouse Hovering by Using action class
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span[2]/span")).click();
		
		driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]")).click();
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).build().perform();
		wb.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("ap_email")).sendKeys("9818660571");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("welcome01");
		driver.findElement(By.id("signInSubmit")).click();
		
		String url = driver.getCurrentUrl();
		System.out.println("The Current URL is " + url);
		
		String pgsource = driver.getPageSource();
		System.out.println("The Current Page source is " + pgsource);
		
		String nmtxt = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).getText();
		System.out.println("The User Login as " + nmtxt);
		
		//Handling Location of a element
		Point p = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).getLocation();
		int xCord = p.getX();
		int yCord = p.getY();
		System.out.println("The Position of UserName is "+ xCord +","+yCord +" pixels");
		
		//Handling Multiple Dropdown
		WebElement drpdwn = driver.findElement(By.id("searchDropdownBox"));
//		WebElement drpdwn = driver.findElement(By.xpath("//*[@id='nav-shop']"));
		Select sel = new Select(drpdwn);
		boolean Flag = sel.isMultiple();
		System.out.println("Is Search Dropdown is Multiselect dropdown? The answer is " +Flag);
		
		//Extracting the values count in a Dropdown 
		WebElement drpdwn1 = driver.findElement(By.id("searchDropdownBox"));
		Select sel1 = new Select(drpdwn1);
		List<WebElement> options = sel1.getOptions();
		int count = options.size();
		System.out.println(count);
		
		//Selecting a value from Dropdown 
		WebElement drpdwn2 = driver.findElement(By.id("searchDropdownBox"));
		Select sel2 = new Select(drpdwn2);
//		sel2.selectByValue("Books");
		sel2.selectByIndex(8);
		
		//Printing each option text present inside Dropdown
		WebElement drpdwn3 = driver.findElement(By.id("searchDropdownBox"));
		Select sel3 = new Select(drpdwn3);
		List<WebElement> options1 = sel3.getOptions();
		int count1 = options1.size();
		for(int i=0; i<count1; i++)
		{
			String optxt = options1.get(i).getText();
			System.out.println(optxt);
		}
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,750)", "");
		
//		driver.quit();
	}

}
