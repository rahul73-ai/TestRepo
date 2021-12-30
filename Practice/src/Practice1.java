import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahsahoo\\DesktopJ\\Java 2021\\Practice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sirsxm-cepl-dt1.pegacloud.net/prweb/PRWebLDAP4");
		/*maximizing*/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		driver.findElement(By.id("txtUserID")).sendKeys("CCManager");
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		driver.findElement(By.className("loginButton")).click();
		driver.wait(3000);
		driver.findElement(By.xpath("//a[@title='New']/i")).click();
		WebElement element=driver.findElement(By.xpath("//*[contains(text(),'New Interaction')]"));
		WebDriverWait wait=new WebDriverWait(driver,600);
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions actions=new Actions(driver);
		actions.click(element).perform();
		//actions.moveToElement(element).click().perform();
		/*WebElement Element=driver.findElement(By.xpath("//*[@class='menu-panel-wrapper']/ul"));
		Select drp=new Select(Element);
		drp.selectByVisibleText("New Interaction");*/
		/*WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement element=driver.findElement(By.xpath("//*[contains(text(),'New Interaction')]"));
		wait.until(ExpectedConditions.visibilityOf(element));
		driver.findElement(By.xpath("//*[contains(text(),'New Interaction')]")).click();*/
		Assert.assertEquals(driver.getTitle(),"Interaction Portal");
		
		
}

}
