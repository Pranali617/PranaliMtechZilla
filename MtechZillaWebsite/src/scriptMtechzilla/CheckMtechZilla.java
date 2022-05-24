package scriptMtechzilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckMtechZilla {
	public static WebDriver driver;

	public static void initialization() throws Exception
	{
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mtechzilla.com/");
        
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		System.out.println("Initialzing Browser");
}
    public void closeBrowser()
	{
		driver.close();
		
		System.out.println("Closed successfully");
	}
	public void mouseHoverActionClass() throws Exception
	{
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),\"About\")]"));		
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().build().perform();
		System.out.println("Selected  About");
		System.out.println("Selected  Services");
	}
	
	public static void clickElement(String xpath1)
	{
		
		WebElement ele=driver.findElement(By.xpath(xpath1));
		ele.click();
		System.out.println("Clicked on element");
	
	}
	

	public void closeTheBrowser()
	{
		driver.close();
		System.out.println("closed the browser");
	}
}


