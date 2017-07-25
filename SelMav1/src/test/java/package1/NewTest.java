package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("Testing123");
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Nuwan\\selenium\\GekoDriver 0.15.0\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  
	  driver.get("https://www.google.com/");
	  driver.quit();
	  
  }
}
