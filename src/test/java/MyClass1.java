import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class MyClass1
{
 
    @Test
    public void test01() throws MalformedURLException, InterruptedException 
    {
    	DesiredCapabilities chromeDC = DesiredCapabilities.chrome();
    	WebDriver driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), chromeDC);
    			
  	    System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver.exe");
        driver.manage().window().maximize(); 
        driver.get("https://www.google.co.il");  
        Thread.sleep(3000);
        driver.quit();
        System.out.println("test01 from class 1 completed successfully");
    }
}
