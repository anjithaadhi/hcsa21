package genericutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility { 
	public void enteringDataUsingJavascript(WebDriver driver, WebElement Element, String  data)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	       js.executeScript("arguments[0].value="+data+"",Element);      
	}
	public void clickingOnElement(WebDriver driver, WebElement Element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	       js.executeScript("arguments[0].click()",Element);      
	}

}
