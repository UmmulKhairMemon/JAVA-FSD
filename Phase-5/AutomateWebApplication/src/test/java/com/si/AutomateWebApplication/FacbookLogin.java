package com.si.AutomateWebApplication;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FacbookLogin {
  private WebDriver driver;
	@Test(groups="FB")
	public void launchFacebook()
	{
		driver.get("http://wwwfacebook.com");
	}
   @Test(groups = "FB", dependsOnMethods = "launchFacebook")
   public void login() {
	  WebElement email = driver.findElement(By.cssSelector("#email"));
	  email.sendKeys("Ummul@gmail.com");
	  
	  WebElement pass = driver.findElement(By.cssSelector("#pass"));
	  pass.sendKeys("Ummul@123");
	  
	  WebElement button = driver.findElement(By.name("login"));
	  button.click();
}
    @BeforeTest
    public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ummul\\Downloads\\Tranning_FSD\\Selenium\\chromedriver.exe");
    driver = new ChromeDriver();
}

    @AfterTest
   public void afterTest() {
	  driver=null;
}
}
