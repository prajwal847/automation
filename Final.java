package raghu;

import java.util.logging.Logger;

import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Test;

public class Final{
	public static void main(String args){
		public class Activity page extends base{
			public WebDriver driver;
@Test
	public void checkNamePic()
	{
	driver=intializeDriver();
	driver.get(property.getProperty("https://qtrecognition.testqtwiz.com/"));
	LOg4.info("Reached website successfully!");
	loginCredentials log=new loginCredentials(driver);
	log.Email().sendKeys("prajwal.hs@qualitestgroup.com");
	log.Password().sendKeys("P@aaw0rd");
	log.Submit(). click();
	Log4.info("Clickd the login button");

}
@Test
public void checkTitle() throws IOException
{
	driver = initializeDriver();
	driver.get("https://qtrecognition.testqtwiz.com/");
	login_page_object login_data = new login_page_object(driver);
	login_data.getUser().sendKeys("madhu.sudhan@qualitestgroup.com");
	login_data.getPassword().sendKeys("P@ssw0rd");
	
	login_data.get_click_login().click();
	String Title=driver.getTitle();
	System.out.println(Title);
	Assert.assertEquals(Title, "QTRecognition");
}
//@AfterTest
//public void driverclose()
//{
//	
//	driver.close();
//	
//	
//}
	
}
	}
