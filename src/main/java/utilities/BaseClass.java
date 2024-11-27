package utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class BaseClass {
	public static WebDriver driver;

	
	public static WebDriverWait wait;

	@BeforeSuite
	public void setUp() throws MalformedURLException, Throwable {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://fitpeo.com/revenue-calculator");
	}
	
	@AfterSuite
	public void setDown() {
		driver.quit();
	}

	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}

}
