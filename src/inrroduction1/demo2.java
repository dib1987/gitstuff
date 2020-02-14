package inrroduction1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedrive.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("welcome to git by tester team");

	}

}
