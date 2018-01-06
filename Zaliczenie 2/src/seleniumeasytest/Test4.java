package seleniumeasytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test4{
    WebDriver driver;
    
    By CatchSelect1 = By.xpath("//select[@id='select-demo']");
    By CatchDay = By.xpath("//option[@value='Friday']");
    By CatchSelect2 = By.xpath("//select[@id='multi-select']");
    By CatchState = By.xpath("//option[@value='Ohio']");
    By ButtonSelect = By.xpath("//button[@id='printMe']");
    
    public Test4(WebDriver driver){
        this.driver = driver;
    }
    
    public void selectDay(){
        driver.findElement(CatchSelect1).click();
        driver.findElement(CatchDay).click();
    }
    
    public void selectState(){
        driver.findElement(CatchState).click();
        driver.findElement(ButtonSelect).click();
    }
}