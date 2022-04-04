package com.si.AutomateWebApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomateRegistration {

    private WebDriver driver;

    @Test
    public void launchFacebook() {
    	driver.get("https://www.shine.com/registration/parser/");
    }
    @Test
    public void login() {
    	
    	
		WebElement name=driver.findElement(By.cssSelector("#id_name"));
		name.sendKeys("Ummul");
		
		WebElement email=driver.findElement(By.cssSelector("#id_email"));
		email.sendKeys("Ummulm@gmail.com");
		
		WebElement phone= driver.findElement(By.cssSelector("#id_cell_phone"));
		phone.sendKeys("9845354422");
		
		WebElement pass=driver.findElement(By.cssSelector("#id_password"));
		pass.sendKeys("Ummul@123");
		
		WebElement check= driver.findElement(By.cssSelector("#id_privacy"));
		if(!check.isSelected())
		{
			check.click();
		}
		
		WebElement button= driver.findElement(By.cssSelector("#registerButton"));
		//button.submit();
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