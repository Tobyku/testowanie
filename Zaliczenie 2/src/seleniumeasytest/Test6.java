package seleniumeasytest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Test6{
    WebDriver driver;
    
    By CatchSearch = By.xpath("//input[@type='search']");
    By CatchButton = By.id("example_next");
    
    
    public Test6(WebDriver driver){
        this.driver = driver;
    }
    
    public void typeText(String text){
        driver.findElement(CatchSearch).click();
        driver.findElement(CatchSearch).sendKeys(text);
    }
    
    public void searchByBtn(){
        driver.findElement(CatchSearch).clear();
        driver.findElement(CatchSearch).click();
        driver.findElement(CatchSearch).sendKeys(Keys.BACK_SPACE);
        for (int i = 0; i < 2; i++) {
            driver.findElement(CatchButton).click();
        }
    }
}