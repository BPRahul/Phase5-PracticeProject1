package autowebapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {
	private static String url = "https://resumebuild.com/";

	public static void main(String[] args) throws InterruptedException {
		WebDriver webdriver = null;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rahul\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();

		signupform(webdriver,"rahulbp1992@gmail.com", "rahul09");


	}

	private static void signupform(WebDriver webdriver,String email,String password) throws InterruptedException 
	{

		webdriver.get(url);
		webdriver.manage().window().maximize();
		
		webdriver.findElement(By.id("signin")).click();
		Thread.sleep(1000);
		
		webdriver.findElement(By.cssSelector(".btn.btn-link.px-0")).click();
		System.out.println("");
		System.out.println("Signin form opened");
		Thread.sleep(1000);
		
		//Email
		WebElement element = webdriver.findElement(By.id("email"));
		element.sendKeys(email);
		String enteredtext=element.getAttribute("value");
		System.out.println("Email Entered successfully");
		System.out.println("Given Email:" +enteredtext);
		System.out.println("");
		Thread.sleep(5000);
		
		//Password
		webdriver.findElement(By.id("password")).sendKeys(password);
		System.out.println("Password Entered successfully");
		System.out.println("");
		Thread.sleep(5000);
		
		webdriver.findElement(By.cssSelector(".btn.btn-primary.w-100.btn-form")).click();
		System.out.println("");
		System.out.println("signedup successfully");
		System.out.println("Moved to next page");
		Thread.sleep(7000);
	//	webdriver.quit();
	//	System.out.println("test ended successfully and Web driver closed");

	}

}