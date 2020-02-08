package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecMethod {

	public static ChromeDriver driver;

	@BeforeMethod
	public void PreLogin() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
