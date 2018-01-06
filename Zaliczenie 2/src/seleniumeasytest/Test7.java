package seleniumeasytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test7{
    WebDriver driver;
    
    By GreenButton = By.id("normal-btn-success");
    By OrangeButton = By.id("normal-btn-warning");
    By RedButton = By.id("normal-btn-danger");
    By BlueButton = By.id("normal-btn-info");
    By CloseButton = By.xpath("//button[@class='close']");
    
    public Test7(WebDriver driver){
        this.driver = driver;
    }
    
    public void firstButton(){
        driver.findElement(GreenButton).click();    
    }
    
    public void secondButton(){
        driver.findElement(CloseButton).click();
        driver.findElement(OrangeButton).click();
    }
    
    public void thirdButton(){
        driver.findElement(RedButton).click();
    }
        
    public void fourthButton(){
        driver.findElement(BlueButton).click();
    }
}