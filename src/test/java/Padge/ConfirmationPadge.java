package Padge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ConfirmationPadge extends BasePadge {
    
   By confirmationWindow = By.xpath("//*[@id=\"otp-code-text\"]");
    
    public WebElement lookForElement(By by) {
   	return driver.findElement(by);
       }
    public boolean isDispalyed() {
	return lookForElement(confirmationWindow).isDisplayed();
	
    }
}
