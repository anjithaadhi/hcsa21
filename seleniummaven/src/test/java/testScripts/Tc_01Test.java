package testScripts;

import org.testng.annotations.Test;

import genericutility.BaseClass;

public  class Tc_01Test extends BaseClass{
	
@Test
public  void  LoginwithValidCredential()
{
	loginPage.getLoginLink().click();
	loginPage.getEmailTf().sendKeys("anjith@gmil.com");
	loginPage.getpasswordTf().sendKeys("************");
	loginPage.getLoginbutton().click();
}
}
