package test;

import static org.junit.Assert.assertTrue;

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
	public void Pantalla() throws InterruptedException {
		driver.get("http://localhost:8888/");
		WebElement user=driver.findElement(By.id("user"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement ok=driver.findElement(By.id("login"));
		
		user.sendKeys("Jorge");
		Thread.sleep(4000);
		password.sendKeys("profe12");
		Thread.sleep(4000);
		ok.click();
		String titulo=driver.getCurrentUrl();
		assertTrue(titulo.equals("http://localhost:8888/login/submit"));
		
	}
	
}
