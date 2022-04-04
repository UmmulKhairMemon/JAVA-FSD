package com.selenium.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForm {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ummul\\Downloads\\Tranning_FSD\\Selenium\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
        driver.get("https://www.shine.com/myshine/login/");
	     
		     
		      WebElement email = driver.findElement(By.xpath("//*[@id=\"id_email_login\"]"));
			   email.getAttribute("placeholder");
			   email.sendKeys("Asnu@gmail.com");
			   
			 WebElement pass = driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
			 pass.getAttribute("placeholder");
			 pass.sendKeys("Ummul@1123");
			 
	     
	}

}
