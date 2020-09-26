package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Testing master\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");

	}

}
