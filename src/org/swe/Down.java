package org.swe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Down {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Drop\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
	WebElement com = driver.findElement(By.id("selenium_commands"));
	Select s = new Select(com);
	s.selectByVisibleText("Wait Commands");
	s.selectByIndex(2);
	List<WebElement> op = s. getOptions();
	for(int i=1; i< op.size(); i++) {
		WebElement x = op.get(i);
		String text = x.getText();
		System.out.println(text);
	}
		
	
		
	
	
	
	}
	}



	
