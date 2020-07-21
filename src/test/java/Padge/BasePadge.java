package Padge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.DriverSingletion;

public class BasePadge {
    String padgeURL = "";
    WebDriver driver =DriverSingletion.getDriver();
    
    public WebElement lookForElement(By by) {
   	return driver.findElement(by);
       }
    public void open() {
   	driver.get(padgeURL);
    }
    

}
