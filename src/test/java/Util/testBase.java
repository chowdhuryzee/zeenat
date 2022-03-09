package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase {
	
	public static Properties prop;
	public static WebDriver driver;
	public testBase() {
		
	try {
FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Configuration\\config.properties");
		prop = new Properties();
		prop.load(fls);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

	public void  initialize() {
		
		String Browsername = prop.getProperty("browser01");
		
		if (Browsername.equals("Chrome")){
			
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
		}
		else if (Browsername.equals("FF")) {
		
		System.out.println("Browser not fund");}
	}
	    
	public static void launchhh(String URL) {
		
		driver.get(prop.getProperty("url"));
		
	  }

	}


