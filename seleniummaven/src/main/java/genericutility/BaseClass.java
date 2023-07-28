package genericutility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;
import objectrepository.RegisterPage;

public class BaseClass {
	public static WebDriver driver;
	public static LoginPage loginPage;
	public static RegisterPage registerPage;
	PropertyUtility utility = new PropertyUtility();
	
	@BeforeClass 
	public void laungingBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	public  void NavigatingToApplication() throws IOException {
		driver.get(utility.readingDtaFromPropertyFile("url"));
		loginPage=new LoginPage(driver);
		registerPage=new RegisterPage(driver);
	}
	@AfterClass
	public void teardownTheBrowser() {
		driver.quit();
		
	}
	

}
