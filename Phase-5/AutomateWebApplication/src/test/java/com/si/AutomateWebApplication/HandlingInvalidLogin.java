package com.si.AutomateWebApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlingInvalidLogin {
	private WebDriver driver;

    @Test(groups = "FB")
    public void launchFacebook() {
        driver.get("http://www.facebook.com");
    }

    @Test(groups="FB", dependsOnMethods = "launchFacebook")
    public void login() {
        WebElement email = driver.findElement(By.cssSelector("#email"));
        
        //Here I will Provide the wrong Email for Invalid Login So That I Can Check the console for invalid Login
        email.sendKeys("Ummul@gmail.com");
       
        WebElement password = driver.findElement(By.cssSelector("#pass"));
        
        //Here I have Provided the wrong password for invalid login
        password.sendKeys("Ummul@123");

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
    }
}