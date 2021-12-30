import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewAccount {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahsahoo\\DesktopJ\\Java 2021\\Practice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sirsxm-cepl-dt1.pegacloud.net/prweb/PRWebLDAP4");	
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//User name
	    driver.findElement(By.xpath("//div[@id='credentialsForm']//following::input[@id='txtUserID']")).sendKeys("CCManager");
	    
	    //Password
		driver.findElement(By.xpath("//div[@id='credentialsForm']//following::input[@id='txtPassword']")).sendKeys("password");
		
		//LogIn Button
		driver.findElement(By.xpath("//div[@id='submit_row']//following::button[@class='loginButton']")).click();
		
		//New and New Interaction
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("//span[@class='menu-item-title' and text()='New Interaction']")).click();
		
		//Add Task
		
		//driver.switchTo().frame(2);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//u[text()='T']")).click();
		
		Actions act=new Actions(driver);
		WebElement addtask=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		act.doubleClick(addtask).perform();
		
		
		
}
}