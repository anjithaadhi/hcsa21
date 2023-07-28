package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public  RegisterPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		}
	@FindBy(linkText="Register")
	   private WebElement Registerlink;
	
	@FindBy(id="gender-female")
	   private WebElement Gender1;
	
	@FindBy(id ="FirstName")
	   private WebElement FirstName2;
	
	@FindBy(id ="LastName")
	   private WebElement LastName3;
	
	@FindBy(id ="Email")
	   private WebElement Email4;
	
	@FindBy(id ="Password")
	   private WebElement Password5;
	
	@FindBy(id="ConfirmPassword")
	   private WebElement ConfirmPassword6;
	
	@FindBy( id ="register-button")
	   private WebElement Registerbutton;
	
	public WebElement getRegisterlink() {
		   return Registerlink;
	   }
	public WebElement getFirstName2() {
		   return FirstName2;
	   }
	public WebElement getLastName3() {
		   return LastName3;
	   }
	public WebElement getEmail4() {
		   return Email4;
	   }
	public WebElement getPassword5() {
		   return Password5;
	   }
	public WebElement getConfirmPassword6() {
		   return ConfirmPassword6;
	   }
	public WebElement getRegisterbutton() {
		   return Registerbutton;
	   }
	 
	
	

}
