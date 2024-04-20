package com.example.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Clase26ApplicationTests {

	@Test
	void seleniumTest() {
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.wikipedia.org");

		WebElement searchInput = driver.findElement(By.id("searchInput"));
		searchInput.sendKeys("Instituto de Astronomía y Física del Espacio");
		searchInput.submit();


		//driver.quit();
	}

}
