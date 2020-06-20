import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyClass1
{
	WebDriver driver;
	
    @Test
    public void test01() 
    {
  	    System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); 
        driver.get("https://www.google.co.il");  
    }

    @BeforeClass
    public void beforeClass() 
    {

        
    }

    @AfterClass
    public void afterClass() throws InterruptedException 
    {
    	Thread.sleep(3000);
        driver.quit();
        System.out.println("test01 from class 1 completed successfully");
    }

  
}
