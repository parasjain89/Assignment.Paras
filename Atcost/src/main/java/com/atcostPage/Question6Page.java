package com.atcostPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.atcost.util.Xls_Reader;

public class Question6Page extends com.atcost.Base.BaseTest{
	
		@FindBy(how = How.XPATH, using = "//*[@type='text']")
		private WebElement searchBtn;

		@FindBy(how = How.XPATH, using = "//*[@class='form-control']")
		private WebElement categories;
		@FindBy(how = How.XPATH, using = "//*[@class='icon-search button-search hover_icon']")
		private WebElement searcbutton;
		@FindBy(how = How.XPATH, using = "//*[@name='description']")
		private WebElement descriptioncheckbox;
		
		@FindBy(how = How.XPATH, using = "//*[@type='button']")
		private WebElement Search;
		@FindBy(how = How.XPATH, using = "//*[@class='eq_height product-grid']")
		private WebElement extraonlyclik;
		@FindBy(how = How.XPATH, using = "//*[@class='item product-layout container-product-grid']")
		//@FindBy(how = How.XPATH, using = "//*[@class='tab-content']//td")
		private WebElement itenselect;
		@FindBy(how = How.XPATH, using = "//*[@id='tab-description']//td")
		private WebElement productdescrit;
		@FindBy(how = How.XPATH, using = "(//*[@class='active'])")
		private WebElement Descriptionbut;
		@FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div[1]/div/div[2]")
		private WebElement Descriptionut;
		@FindBy(how = How.XPATH, using = "//*[@class='quantity_button plus arrow_icon']")
		private WebElement quantity_buttonplus;
		
		public Question6Page () {
			PageFactory.initElements(driver, this);
		}
				
		public void producnamenverify ()  {
			 System.out.println(" Start question 6rd answer /Slectitem and add to chart/");
				waitclass();
				 Xls_Reader xlsreader = new Xls_Reader("./src/main/java/com/atcost/util/Projectdata.xlsx");
				 String sheetName = "Items";
				 int rowcount =xlsreader.getRowCount(sheetName);
				 for(int rowNum=2;rowNum<=rowcount;rowNum++) {
				String items=	xlsreader.getCellData(sheetName,"ItemName",rowNum);
				String description=	xlsreader.getCellData(sheetName,"Description",rowNum);
				String item=	xlsreader.getCellData(sheetName,"itemcte",rowNum);
				waitclass();
				searchBtn.sendKeys(items);
		 
		Select itemkl =new Select(driver.findElement(By.xpath("//*[@name='category_id']")));
		itemkl.selectByVisibleText(item);
		searcbutton.click();
		   
       	itenselect.click();
		
		Descriptionbut.click();
		
		System.out.println(" 2");
		}  
} 
				 
                
                        public String Descritionverify() {
                       String jk = productdescrit.getAttribute("");
						return jk;
			} 
}
