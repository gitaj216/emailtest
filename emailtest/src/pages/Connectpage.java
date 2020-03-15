package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Connectpage {

	
	@FindBy (xpath="//a[.='Connect']")
	WebElement conecttab;
	

	@FindBy (xpath="//input[@title='Name for this connection']")
	WebElement name;
	

	@FindBy (xpath="//select[@title='HTTP or HTTPS']")
	WebElement schemes;
	

	@FindBy (id="//input[@title='The HTTP port used to connect to the server']")
	
	WebElement port;
	
	
	@FindBy (id="//button[.='Save']")
	WebElement savebutton;
}
