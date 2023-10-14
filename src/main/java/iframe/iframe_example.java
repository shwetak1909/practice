package iframe;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class iframe_example 
{
	public static WebDriver driver;
	@BeforeTest
	public void lunchchromebrowser()
	{
	
		System.setProperty("Webdriver.chrome.driver", "C:/chrome/chromedriver-win64/chromedriver.exe/");
		 ChromeOptions opt = new ChromeOptions();

         opt.addArguments("--remote-allow-origins=*");
         driver = new ChromeDriver(opt);
		driver.get("http://www.rediff.com");
		 driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
}


