package com.selenium.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ummul\\Downloads\\Tranning_FSD\\Selenium\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
         driver.get("https://www.shine.com/registration/parser/");
	     
	         WebElement name = driver.findElement(By.xpath("//*[@id=\"id_name\"]"));
		     name.getAttribute("placeholder");
			 name.sendKeys("HP");
		     
		     WebElement email = driver.findElement(By.xpath("//*[@id=\"id_email\"]"));
			   email.getAttribute("placeholder");
			   email.sendKeys("harry@WBS.com");
			   
			 WebElement number = driver.findElement(By.xpath("//*[@id=\"id_cell_phone\"]"));
			 number.getAttribute("placeholder");
		     number.sendKeys("9822334466");
			 
			 WebElement pass = driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
			 pass.getAttribute("placeholder");
			 pass.sendKeys("Harry@1123");
			 
			 WebElement check = driver.findElement(By.xpath("//*[@id=\"id_privacy\"]"));
			 if(check.isSelected())
			 {
				 check.click();
			 }
	     
	}

}
