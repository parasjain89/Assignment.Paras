package com.atcost.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseTest {
	
	
	  static public WebDriver driver;
	  static public Properties pro;
	  
	  public BaseTest(){
		 try { pro = new Properties();
		  FileInputStream ip = new FileInputStream("./src/main/java/com/atcost/comfiq/confiq.properties");
		  pro.load(ip);
	    }catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch(IOException e) {
		  e.printStackTrace();}
	  }

		
		  public void inbokebrowser() {
			 // driver = new ChromeDriver();
				String browasname =pro.getProperty("browser");
				
				if(browasname.equals("chrome")) {	
					 driver = new ChromeDriver();
					 }
				else if(browasname.equals("ff")) {		
				}
				else
				{System.out.println("Browser not found");
				}
			
		  
	  }
		  public void waitclass() {

				 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			 }
		  
		  
		  public void bwaitclass() {

				 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
			 }
		}
		 

