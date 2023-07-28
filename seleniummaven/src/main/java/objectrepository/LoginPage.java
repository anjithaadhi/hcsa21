package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public  LoginPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		}
	   @FindBy(linkText="Log in")
	   private WebElement LoginLink;
	   
	   @FindBy(id= "Email")
	   private WebElement EmailTf;
	   
	   @FindBy( id= "password")
	   private WebElement passwordTf;
	   
	   @FindBy(xpath ="//input[@value='Log in']")
	   private WebElement Loginbutton;
	   
	   public WebElement getLoginLink() {
		   return LoginLink;
	   }
	   
	   public WebElement getEmailTf() {
		   return EmailTf;
	   }
	   public WebElement getpasswordTf() {
		   return passwordTf;
	   }
	   public WebElement getLoginbutton() {
		   return Loginbutton;
	   }
	    
	   
	   
	

}
