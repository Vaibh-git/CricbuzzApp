package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;

public class TC001_SmokeTest {
	
	WebDriver driver;
	@BeforeTest
	public void Setup() {
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();	
	}
	@Test
	public void HomePageClick() {
		HomePage page = new HomePage(driver);
		page.Myaccount();
		//page.Home_Btn();
		
	}
	@AfterTest
	public void GetUp() {
		
		//driver.close();
	}

}
