package factory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	/**
	 * All WebElements are identified by @FindBy annotation
	 */
	WebDriver driver;
	@FindBy(name="uid")
	WebElement userGuName;
	
	@FindBy(name="passw")
	WebElement passGuru;
	
	@FindBy(className="barone")
	WebElement titleText;
	
	@FindBy(name="btnSubmit")
	WebElement login;
	
	public login(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	//Set user name in textbox
	public void setUserName(String strUserName){
		userGuName.sendKeys(strUserName);
		
	}
	
	//Set password in password textbox
	public void setPassword(String strPassword){
	passGuru.sendKeys(strPassword);
	}
	
	//Click on login button
	public void clickLogin(){
			login.click();
	}
	
	//Get the title of Login Page
	public String getLoginTitle(){
	 return	titleText.getText();
	}
	/**
	 * This POM method will be exposed in test case to login in the application
	 * @param strUserName
	 * @param strPasword
	 * @return
	 */
	public void loginToGuru99(String strUserName,String strPasword){
		//Fill user name
		this.setUserName(strUserName);
		//Fill password
		this.setPassword(strPasword);
		//Click Login button
		this.clickLogin();
				
	}

}
