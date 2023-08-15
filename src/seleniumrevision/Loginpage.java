package seleniumrevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "C:\\Java\\chromedriver.exe.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flifkart.com");
	}

}
