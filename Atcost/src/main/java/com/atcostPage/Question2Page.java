package com.atcostPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;




public class Question2Page extends com.atcost.Base.BaseTest{
	@FindBy(how = How.XPATH, using = ".//*[@class='per-page']/a[2]")
	private WebElement perpage;
	//LM6RPg
	@FindBy(how = How.XPATH, using = ".//*[@id='content']/p[1]/a[3]")
	private WebElement content;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='next']")
	private WebElement next;
	
	public Question2Page () {
		PageFactory.initElements(driver, this);
	}
			
	
		public void Handledynamictable ()  {
			System.out.println(" Start question 2nd answer /Handledynamictable/");
		
			driver.get(pro.getProperty("url2"));
			bwaitclass();
			 driver.manage().window().maximize(); 
			 perpage.click();
			    int num_of_clicks = Integer.parseInt(content.getText());
			    for (byte i = 1; i < num_of_clicks; i++) {
			        List<WebElement> records_in_page = driver.findElements(By.xpath(".//*[@class='list issues']/tbody/tr"));
			        for (byte j = 0; j < records_in_page.size(); j++) {
			            String Issue_Subject = driver.findElement(
			                    By.xpath(".//*[@class='list issues']/tbody/tr[" + (j+1)
			                            + "]/td[5]")).getText();
			            System.out.println(Issue_Subject);
			        }
			        next.click();
			        System.out.println(" Successfull complete question 2nd answer /Handledynamictable/");
			    }
	
				}
		
			}

