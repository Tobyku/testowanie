package seleniumeasytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test2{
    WebDriver driver;
	
	By CheckBox = By.id("isAgeSelected");
	By CheckAll = By.xpath("//input[@value='Check All']");
        By UncheckAll = By.xpath("//input[@value='Uncheck All']"); 
    
    public Test2(WebDriver driver){
    	this.driver = driver;
    }
    
    public void checkBox(){
    	driver.findElement(CheckBox).click();
    }
    
    public void checkAll(){
    	driver.findElement(CheckAll).click();
    }
    
    public void uncheckAll(){
    	driver.findElement(UncheckAll).click();
    }
}