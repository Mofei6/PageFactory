package test;

import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;

import factory.Homepage;
import factory.login;


public class Testlogin {
	FirefoxDriver driver;
	login objLogin;
	Homepage objHomePage;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.gecko.driver", "E:\\tools\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "E:/CloudMusic/火狐/firefox.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.testfire.net/login.jsp");
	}

	
	@Test(timeout=0)
	public void test_Home_Page_Appear_Correct(){
		//Create Login Page object
	objLogin = new login(driver);
	
	objLogin.loginToGuru99("admin", "admin");
	// go the next page
	objHomePage = new Homepage(driver);
	//Verify home page
	
	Assert.assertTrue(objHomePage.getHomePageUserName().toLowerCase().contains("congratulations!"));
	}
	

}
