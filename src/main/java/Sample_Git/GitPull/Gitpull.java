package Sample_Git.GitPull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gitpull 
{
	@Test
	public void Git() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
		
		driver.close();
		
		System.out.println("Data is set :)");
		
	}

}
