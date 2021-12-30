import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchNew {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahsahoo\\DesktopJ\\Java 2021\\Practice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sirsxm-cepl-dt1.pegacloud.net/prweb/PRWebLDAP4");	
		driver.findElement(By.id("txtUserID")).sendKeys("CCManager");
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		driver.findElement(By.className("loginButton")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='New']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='New Interaction']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//label[text()='Account Number']//following::input[1]")).sendKeys("10016197427");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//div[text()='Account Number']//following::span[16]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Verify']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Add ']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[text()='Refund' and @class='Add_Tasks']")).click();
		Actions as=new Actions(driver);
		WebElement ads=driver.findElement(By.xpath("//a[text()='Add Services' and @class='Add_Tasks']"));
		as.doubleClick(ads).perform();;
		
	    /*Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Add tasks']")).click();*/
		
		
		
		Thread.sleep(5000);
		/*js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//button[text()='Close']")).click();*/
		
		//Add Services
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Streaming']")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,5000)");
		
		WebElement un=driver.findElement(By.xpath("//label[text()='Streaming Username']//following::input[1]"));
		un.click();
		un.sendKeys("amttest1@siriusxm.com");
		
		WebElement emailaddress=driver.findElement(By.xpath("//label[text()='Email Address']//following::input[1]"));
		emailaddress.click();
		 
		Thread.sleep(3000);
		WebElement srv=driver.findElement(By.xpath("//label[text()='Streaming Username']//following::button[1]"));
		srv.click();
		
		Thread.sleep(3000);
		WebElement nxt=driver.findElement(By.xpath("//label[text()='Streaming Username']//following::button[3]"));
		nxt.click();
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,3000)");
		WebElement cs=driver.findElement(By.xpath("//div[text()='SiriusXM Streaming Music & Entertainment - Monthly']//following::input[2]"));
	    cs.click();
	    Thread.sleep(3000);
	    
	    js.executeScript("window.scrollBy(0,3000)");
	    WebElement csn=driver.findElement(By.xpath("//button[text()='Next']"));
	    csn.click();
	    Thread.sleep(3000);
	    
	    js.executeScript("window.scrollBy(0,3000)");
	    WebElement vsu=driver.findElement(By.xpath("//button[text()='Next']"));
	    vsu.click();
	    Thread.sleep(3000);
	    
	   
	    js.executeScript("window.scrollBy(0,5000)");
	    Thread.sleep(3000);
	    WebElement sup=driver.findElement(By.xpath("//button[text()='Next']"));
	    sup.click();
	    Thread.sleep(3000);
	    
	    js.executeScript("window.scrollBy(0,5000)");
	    Thread.sleep(3000);
	    WebElement sb=driver.findElement(By.xpath("//button[text()='Submit']"));
	   	    sb.click();
	   	    
	   	    driver.findElement(By.xpath("//button[text()='Accept']")).click();
	    
	    
	}


}

	   
	    
	    
	    
		
		
		
		
	

