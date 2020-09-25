package tests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class  BasicTest {
	protected WebDriver driver;
	protected WebDriverWait waiter;
	protected String baseURL;
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterTest(ITestResult result) throws IOException {
		String fileName = new SimpleDateFormat("yyyyMMddHHmm'.txt'").format(new Date());

		if (result.getStatus() == ITestResult.FAILURE) {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 		
			FileHandler.copy(scrFile, new File("C:\\Users\\Kruni\\Desktop\\ProjAndrijaKrunic\\ProjAndrijaKrunic\\src\\Screenshots\\"+fileName+".png"));
			System.out.println("Sacuvan je screenshot!");
		}
	}

	@AfterClass
	public void afterClass() {
		//this.driver.close();
	}
}
