package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.Connectpage;

public class Connectaction {
	WebDriver driver;

	

	public void clicksconnect_page() throws Throwable {
		Connectpage Connectpage = new Connectpage();
		PageFactory.initElements(driver, Connectpage);
//		conecttab.click();
		


	}


	public void enters_name() throws Throwable {
//		.sendKeys("Testaj");

	}


	public void enters_scheme() throws Throwable {
//		Select s =new Select(s1);
//		s.selectByVisibleText("https");

	}

	public void entersport() throws Throwable {
		WebElement port= driver.findElement(By.xpath("//input[@title='The HTTP port used to connect to the server']"));
		port.clear();
		port.sendKeys("8184");
	}



	public void save() throws Throwable {
		driver.findElement(By.xpath("//button[.='Save']")).click();
	}
}
