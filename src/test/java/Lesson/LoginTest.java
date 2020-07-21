package Lesson;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Padge.ConfirmationPadge;
import Padge.SignPadge;

public class LoginTest {
    ConfirmationPadge confirmationPadge;
    SignPadge signPadge;
    WebDriver driver;
   
    @BeforeMethod
    public void setup() {
	signPadge = new SignPadge();
	confirmationPadge = new ConfirmationPadge();
//	driver = DriverSingletion.getDriver();
	signPadge.open();
	
    }
    
    @Test
    public void successfullLogin() {
	signPadge.insertLogin("demo");
	signPadge.insertPassword("demo");
	signPadge.clickLoginButton();
//	driver.get(LINK);
//	
//	
//	usernameInput.clear();
//	passwordInput.clear();
//	
//	usernameInput.sendKeys("demo");
//	passwordInput.sendKeys("demo");
//	signInButton.click();
//	
	Assert.assertTrue(confirmationPadge.isDispalyed());
	
    }
    
    @AfterTest
    public void close() {
	signPadge = null;
    }
    

}
