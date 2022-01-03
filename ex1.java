package raghu;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./praju3/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://www.qaclickacademy.com/practice.php");
exerciseone(driver); 												
exercisetwo(driver);
exercisethree(driver);
exercisefour(driver);
exerciseFive(driver);
exerciseSeven(driver);
exerciseEight(driver);
exerciseNine(driver);
exerciseSix(driver);
	}
	public static void exerciseone(WebDriver driver)
	{
driver.findElement(By.xpath("//input[@value='radio1']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='radio2']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='radio3']")).click();
Thread.sleep(2000);
	}
}
public static void exercisetwo(WebDriver driver)
{
driver.findElement(By.id("autocomplete")).click();
driver.findElement(By.id("autocomplete")).sendKeys("United States");
Thread.sleep(3000);
List <WebElement> countries = driver.findElement(By.xpath("//ul/li[@class='ui-menu-item']"));
for(WebElement country:countries)
{
	if(country.getText().equalsIgnoreCase("United States minor Outlying Islands"))
	{
		country.click();
		break;
	}
}
System.out.println(driver.findElement(By.id("autocomplete")).getText());
}
public static void exercisethree(WebDriver driver)
{
	driver.findElement(By.xpath("//input[@id='checkBoxOption1")).click();
	driver.findElement(By.xpath("//input[@id='checkBoxOption2")).click();
	driver.findElement(By.xpath("//input[@id='checkBoxOption3")).click();
	//open window
	String parentswitchWin = driver.getWindowHandle();
	driver.findElement(By.id("openwindow")).click();
	Set<String> switchwindow = driver.getWindowHandles();
	for(String switchwin:switchwindow)
	{
		if(!switchwin.equals(parentswitchWin)){
			driver.switchTo().window(switchwin);
			Thread.sleep(2000);
		}
	}
}
driver.switchTo().window(parentswitchWin);
driver.findElement(By.id("openwindow")).click();
Set<String> switchwindow1 = driver.getWindowHandles();
for(String switchwin:switchwindow1)
{ 
	if(!switchwin.equals(parentswitchWin)){
		driver.switchTo().window(switchwin1);
		Thread.sleep(2000);
		driver.close();
	}
}
public static void exercisefour(WebDriver driver) throws InterruptedException					
{
	driver.findElement(By.id("checkBoxOption1")).click();
	Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
	Thread.sleep(100);
	driver.findElement(By.id("checkBoxOption2")).click();
	Assert.assertFalse(driver.findElement(By.id("checkBoxOption2")).isSelected());
	Thread.sleep(100);
	driver.findElement(By.id("checkBoxOption3")).click();
	Assert.assertFalse(driver.findElement(By.id("checkBoxOption3")).isSelected());
}

public static void exerciseFive(WebDriver driver) throws InterruptedException 
{

	driver.get("http://www.qaclickacademy.com/practice.php");
	driver.findElement(By.id("openwindow")).click();								
	Set<String> newWindow = driver.getWindowHandles();								
	Iterator<String> it = newWindow.iterator();									
	String parentid = it.next();											
	Thread.sleep(1500);
	driver.switchTo().window(parentid);										
	
}

public static void exerciseSix(WebDriver driver) throws InterruptedException
{
	driver.findElement(By.id("opentab")).click();									
	Set<String> newTab = driver.getWindowHandles();									
	Iterator<String> it = newTab.iterator();
	it.next();
	String child=it.next();
	driver.switchTo().window(child);
	Thread.sleep(1500);
	driver.close();
	Thread.sleep(2000);
	driver.quit();
}

public static void exerciseSeven(WebDriver driver) throws InterruptedException 
{
	
	driver.findElement(By.id("name")).sendKeys("Nikhil");								
	Thread.sleep(1500);
	driver.findElement(By.id("alertbtn")).click();									
	Thread.sleep(500);
	driver.switchTo().alert().accept();										
}

public static void exerciseEight(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor jse = (JavascriptExecutor) driver;								
	Thread.sleep(500);
	jse.executeScript("window.scrollBy(0,600)");									
	Thread.sleep(1500);
	jse.executeScript("document.querySelector('.tableFixHead').scrollBy(0,6000)");					
	Thread.sleep(1000);
}

private static void exerciseNine(WebDriver driver) throws InterruptedException 
{
	Actions a = new Actions(driver);
	Thread.sleep(500);
	WebElement mouseHower = driver.findElement(By.id("mousehover"));						
	a.moveToElement(mouseHower).click().build().perform();								
	Thread.sleep(500);
	WebElement mouseClick = driver.findElement(By.cssSelector("a[href='#top']"));					
	Thread.sleep(2000);
	a.moveToElement(mouseClick).click().build().perform();
	Thread.sleep(500);
}
}

