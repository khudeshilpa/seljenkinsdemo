package seljenkinsdemo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seljenkinsintegration {
	public static String driverPath = "E:/browser/chromedriver_win32/";
	   public static WebDriver driver;
	@Test
	public void test(){
		
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		String actualValue=driver.getTitle();
		System.out.println(actualValue);
		
}

}
