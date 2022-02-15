package test;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {

	private WebDriver driver;
	
	@BeforeEach
	void init() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver(options);		
	}
	@Test
	public void Pantalla() {
		driver.get("http://localhost:8888/");
		WebElement user=driver.findElement(By.id("user"));
		WebElement password=driver.findElement(By.id("user"));
		WebElement ok=driver.findElement(By.id("login"));
		

		
	}
	
}
