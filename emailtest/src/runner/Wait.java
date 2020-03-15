package runner;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import managers.FileReaderManager;

import com.google.common.base.Predicate;


public class Wait {

	public static void untilJqueryIsDone(WebDriver driver){
		// untilJqueryIsDone(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
	}

	public static void untilJqueryIsDone(WebDriver driver, Long timeoutInSeconds){
		until(driver, (d) ->
		{
			Boolean isJqueryCallDone = (Boolean)((JavascriptExecutor) driver).executeScript("return jQuery.active==0");
			if (!isJqueryCallDone) System.out.println("JQuery call is in Progress");
			return isJqueryCallDone;
		}, timeoutInSeconds);
	}

	public static void untilPageLoadComplete(WebDriver driver) {
		// untilPageLoadComplete(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
	}

	public static void untilPageLoadComplete(WebDriver driver, Long timeoutInSeconds){
		until(driver, (d) ->
		{
			Boolean isPageLoaded = (Boolean)((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			if (!isPageLoaded) System.out.println("Document is loading");
			return isPageLoaded;
		}, timeoutInSeconds);
	}

	public static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition){
		// until(driver, waitCondition, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
	}


	private static void until(WebDriver driver, Predicate<WebDriver> waitCondition, Long timeoutInSeconds){
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
		webDriverWait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS);
		try{
			webDriverWait.until(waitCondition);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}          
	}


	public static void explicit(WebDriver driver, int timeout, WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, 2);
		WebDriverWait wait2 = new WebDriverWait(driver, timeout);

		wait.until(ExpectedConditions.elementToBeClickable(locator));
		
//		
//		Wait w= new FluentWait(Webdriver reference)
//				.withTimeout(50,TimeUnit.SECONDS)
//				.pollingevery(3,TimeUnit.SECONDS)
//				.ignoring(NoSuchElementException.class);

System.out.println("Waiting for element ");


	}

}