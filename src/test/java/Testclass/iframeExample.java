package Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframeExample 
{

	public static WebDriver driver;
public   static WebDriver  OpenChromeBrowser() 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("http://rediff.com");
return driver;
} 

}

