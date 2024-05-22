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
	void seleniumTest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		try{
			driver.get("https://www.wikipedia.org");
			WebElement searchInput = driver.findElement(By.id("searchInput"));
			searchInput.sendKeys("Instituto de Astronomía y Física del Espacio");
			searchInput.submit();

			Thread.sleep(5000);
			String pageTitle = driver.getTitle();
			if(pageTitle.contains("Instituto de Astronomía y Física del Espacio")){
				System.out.println("Test ok");
			} else {
				System.out.println("Test not ok");
			}
		} catch (Error e){
			e.printStackTrace();
			System.out.println("Se detectó un error "+e);
		} finally {
				driver.quit();
			}
		}


	}


