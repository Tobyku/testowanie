package seleniumeasytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test3{
    WebDriver driver;
    
    By RadioSex = By.xpath("//input[@name='optradio'][@value='Male']");
    By ButtonCheckSex = By.xpath("//button[@id='buttoncheck']");
    By FemaleRadioButton = By.xpath("//input[@name='gender'][@value='Female']");
    By AgeRadioButton = By.xpath("//input[@name='ageGroup'][@value='15 - 50']");
    By CheckButton = By.xpath("//button[@onclick='getValues();']");
    
    public Test3(WebDriver driver){
        this.driver = driver;
    }
    
    public void selectSex(){
        driver.findElement(RadioSex).click();
        driver.findElement(ButtonCheckSex).click();
    }
    
    public void selectSexAge(){
        driver.findElement(FemaleRadioButton).click();
        driver.findElement(AgeRadioButton).click();
        driver.findElement(CheckButton).click();
    }
}