package Padge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignPadge extends BasePadge{
    String padgeURL = "https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru"
	    	+ "%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true";
    	    
    By usernameInput = By.name("username");
    By passwordInput = By.name("password");
    By signInButton = By.id("login-button");
    
    public WebElement lookForElement(By by) {
	return driver.findElement(by);
    }
    
    public void insertLogin(String login) {
	//driver.findElement(usernameInput).sendKeys(login);
	lookForElement(usernameInput).sendKeys(login);
	
    }
    public void insertPassword(String password) {
	//driver.findElement(passwordInput).sendKeys(password);  
	lookForElement(passwordInput).sendKeys(password);
    }
    
    public void clickLoginButton() {
	lookForElement(signInButton).click();
    }
    
    public void open() {
	driver.get(padgeURL);
	
    }
   

}
