package Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AuthTest {
    
    WebDriver driver;
    final String LINK = "https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru"
    	+ "%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true";
    
    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test
    public  void validData() {
	driver.get(LINK);
	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("username")).sendKeys("demo");
	driver.findElement(By.name("password")).sendKeys("demo");
	driver.findElement(By.id("login-button")).click();
    }
    
    @Test
    public void emptyFields() {
//   	System.setProperty("webdriver.chrome.driver", "d:\\наташа it step\\java\\Automatization\\src\\main"
//   		+ "\\resources\\chromedriver.exe");
//   	WebDriver driver = new ChromeDriver();
   	driver.manage().window().maximize();
   	
   	driver.get(LINK);
   	driver.findElement(By.name("username")).clear();
   	driver.findElement(By.name("password")).clear();
   	driver.findElement(By.id("login-button")).click();
   	
       }
    
    @Test
    public void fieldLoginIsEmpty() {

   	driver.manage().window().maximize();
   	/*
   	 * Открыть приложение
   	 */
   	driver.get(LINK);
   	/*
   	 * Очистить поле логин и пароль
   	 */
   	driver.findElement(By.name("username")).clear();
   	driver.findElement(By.name("password")).clear();
   	/*
   	 * Поле логин оставить пустым
   	 * В поле пароль ввести валидный пароль
   	 */
   	driver.findElement(By.name("password")).sendKeys("demo");
   	/*
   	 * Нажать кнопку "Войти"
   	 */
   	driver.findElement(By.id("login-button")).click();
   	
       }
   
    
}
