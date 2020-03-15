package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.cucumber.java.en.Given;
import cucumber.api.java.en.Given;
import utility.Wait;

public class Connect_steps {
	public static WebDriver driver;
	
		
		 

@Given("^user is on home page$")
public void user_is_on_home_page() throws Throwable {
	driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "Webdrivers/chromedriver.exe");

	driver.get("http://localhost:8999/hawtio");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	
	

}

@Given("^clicks on connect page$")
public void clicks_on_connect_page() throws Throwable {

	WebElement abc=driver.findElement(By.xpath("//a[.='Connect']"));
	Thread.sleep(2000);
	utility.Wait.explicit(driver, 2, abc);
	
	abc.click();
//	Thread.sleep(3000);
	
	
	
    
}

@Given("^user enters name$")
public void user_enters_name() throws Throwable {
	
WebElement a=	driver.findElement(By.xpath("//input[@title='Name for this connection']"));

//Thread.sleep(100);
//Wait.untilJqueryIsDone(driver, 10L);
//WebDriverWait wait2 = new WebDriverWait(driver, 1);
//WebElement jn=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@title='Name for this connection']")));
//	utility.Wait.explicit(driver, 21, a);
	//wait2.until(ExpectedConditions.elementToBeClickable(a));
	a.sendKeys("Testaj");
	
	driver.findElement(By.xpath("//a[.='Logs']")).click();
	WebElement aa=	driver.findElement(By.xpath("//div[.='Logger']"));
	
//	WebElement an=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[.='Logger']")));
	
//	Thread.sleep(2000);
////
//	Wait wait1 = new FluentWait<WebDriver>(driver)	
//			.withTimeout(50,TimeUnit.SECONDS)
//			.pollingEvery(3,TimeUnit.SECONDS)
//			.ignoring(NoSuchElementException.class);
//	
//	utility.Wait.explicit(driver, 21, aa);
	aa.click();
    
    
}

@Given("^user enters scheme$")
public void user_enters_scheme() throws Throwable {
//WebElement s1= driver.findElement(By.xpath("//select[@title='HTTP or HTTPS']"));
//	
//	Select s =new Select(s1);
//	s.selectByVisibleText("https");
    
}

@Given("^user enters port$")
public void user_enters_port() throws Throwable {
//	WebElement port= driver.findElement(By.xpath("//input[@title='The HTTP port used to connect to the server']"));
//	port.clear();
//	port.sendKeys("8184");
	driver.findElement(By.xpath("//a[.='Logs']")).click();
	WebElement a=	driver.findElement(By.xpath("//div[.='Logger']"));
	utility.Wait.explicit(driver, 21, a);
	a.click();
    
}

@Given("^user clicks on save$")
public void user_clicks_on_save( ) throws Throwable {
//	driver.findElement(By.xpath("//button[.='Save']")).click();
	driver.findElement(By.xpath("//a[.='Logs']")).click();
	WebElement a=	driver.findElement(By.xpath("//div[.='Logger']"));
	utility.Wait.explicit(driver, 21, a);
	a.click();
	
	
    
}


}
