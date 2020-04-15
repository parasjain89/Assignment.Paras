package com.atcostPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.atcost.util.Xls_Reader;

public class Question4Page extends com.atcost.Base.BaseTest {
	public Question4Page () {
		PageFactory.initElements(driver, this);
	}
		

	public void Slecitem ()  {
		 waitclass();
		 Xls_Reader xlsreader = new Xls_Reader("./src/main/java/com/atcost/util/Projectdata.xlsx");
		 String sheetName = "Sheet1";
		 int rowcount =xlsreader.getRowCount(sheetName);
		 for(int rowNum=2;rowNum<=rowcount;rowNum++) {
		String categori=	xlsreader.getCellData(sheetName,"Categories",rowNum);
		String subcategori=	xlsreader.getCellData(sheetName,"SubCategories",rowNum);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,200)");
		 bwaitclass();
		 Actions action = new Actions(driver);
		 try {	List <WebElement> list = driver.findElements(By.className("has_sub"));
		List <WebElement> list2 = driver.findElements(By.className("dark_bg_color_hover"));
		 for(WebElement link:list){
			 String name =link.getText();
			 
			 if(name.equalsIgnoreCase(categori)) {
				 for(WebElement link1:list2){
					 String name1 =link.getText();
					 if(name1.equalsIgnoreCase(subcategori)) {
				 action.moveToElement(link).perform();}
				 action.moveToElement(link1).click().perform();

			 }}}}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
				List <WebElement> list = driver.findElements(By.className("has_sub"));
				List <WebElement> list2 = driver.findElements(By.className("dark_bg_color_hover"));
				 for(WebElement link:list){
					 String name =link.getText();
					 
					 if(name.equalsIgnoreCase(categori)) {
						 for(WebElement link1:list2){
							 String name1 =link.getText();
							 if(name1.equalsIgnoreCase(subcategori)) {
						 action.moveToElement(link).perform();}
						 action.moveToElement(link1).click().perform();
			}}}}}}}
		
					 
		 
		
	
	
	
	

	


