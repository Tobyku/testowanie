package seleniumeasytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test10{
    WebDriver driver;
    
    By ButtonAddAll = By.xpath("//button[@class='pAddAll btn btn-primary btn-sm']");
    By ButtonRemoveAll = By.xpath("//button[@class='pRemoveAll btn btn-primary btn-sm']");
    By ButtonAdd = By.xpath("//button[@class='pAdd btn btn-primary btn-sm']");
    By ButtonRemove = By.xpath("//button[@class='pRemove btn btn-primary btn-sm']");
    By SelectName1 = By.xpath("//option[@data-id='2']");
    By SelectName2 = By.xpath("//option[@data-id='5']");
    By SelectName3 = By.xpath("//option[@data-id='8']");

    public Test10(WebDriver driver){
        this.driver = driver;
    }
    
    public void addAll(){
        driver.findElement(ButtonAddAll).click();
    }
    
    public void removeAll(){
        driver.findElement(ButtonRemoveAll).click();
    }
    
    public void addName(){
        driver.findElement(SelectName1).click();
        driver.findElement(ButtonAdd).click();
        driver.findElement(SelectName2).click();
        driver.findElement(ButtonAdd).click();
        driver.findElement(SelectName3).click();
        driver.findElement(ButtonAdd).click();
    }
    
    public void removeName(){
        driver.findElement(SelectName1).click();
        driver.findElement(ButtonRemove).click();
        driver.findElement(SelectName2).click();
        driver.findElement(ButtonRemove).click();
        driver.findElement(SelectName3).click();
        driver.findElement(ButtonRemove).click();
    }
}