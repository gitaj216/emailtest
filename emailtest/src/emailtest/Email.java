package emailtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Email {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//
		//System.setProperty("webdriver.gecko.driver", "Webdriver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
//		
//		System.setProperty("webdriver.ie.driver", "ie/IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
//		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "Webdrivers/chromedriver.exe");
	
		driver.get("http://localhost:8999/hawtio");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Connect']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@title='Name for this connection']")).sendKeys("Testaj");
		WebElement s1= driver.findElement(By.xpath("//select[@title='HTTP or HTTPS']"));
		
		Select s =new Select(s1);
		s.selectByVisibleText("https");
		//s.selectByValue("https");
		WebElement port= driver.findElement(By.xpath("//input[@title='The HTTP port used to connect to the server']"));
		port.clear();
		port.sendKeys("8184");
		driver.findElement(By.xpath("//button[.='Save']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
