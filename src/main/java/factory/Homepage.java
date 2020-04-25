package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	@FindBy(id="_ctl0__ctl0_Content_Main_promo")
	WebElement homePageUserName;
	public Homepage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	
	//Get the User name from Home Page
		public String getHomePageUserName(){
			System.out.println(homePageUserName.getText());
		 return	homePageUserName.getText();
		}
}
