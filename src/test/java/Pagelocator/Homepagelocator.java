package Pagelocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Util.testBase;

public class Homepagelocator extends testBase {

public Homepagelocator () {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(how=How.LINK_TEXT, using="Login")
	public WebElement Login_Option; 
	
	/*@FindBy(how=How.XPATH, using="//label[@class='unselectable'][normalize-space()='Gaming PCs']")
	public WebElement ClickGamingPcs; 
	
	
	@FindBy(how=How.XPATH, using="//h2[text()='with HP Gaming PCs']")
	public WebElement VerifyGamingPcsPage;*/
	
	
	
}
