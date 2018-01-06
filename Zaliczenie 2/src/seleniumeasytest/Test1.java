package seleniumeasytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test1{
    WebDriver driver;
    
    By TextBox = By.xpath("//input[@id='user-message']");
    By ShowMessageButton = By.xpath("//button[@onclick='showInput();']");
    By TextBoxA = By.xpath("//input[@id='sum1']");
    By TextBoxB = By.xpath("//input[@id='sum2']");  
    By TotalButton = By.xpath("//button[@onclick='return total()']");
    
    public Test1(WebDriver driver){
        this.driver = driver;
    }
    
    public void typeText(String text){
        driver.findElement(TextBox).click();
        driver.findElement(TextBox).clear();
        driver.findElement(TextBox).sendKeys(text);
        driver.findElement(ShowMessageButton).click();
    }
    
    public void sum(String a, String b){
        driver.findElement(TextBoxA).click();
        driver.findElement(TextBoxA).clear();
        driver.findElement(TextBoxA).sendKeys(a);
        
        driver.findElement(TextBoxB).click();
        driver.findElement(TextBoxB).clear();
        driver.findElement(TextBoxB).sendKeys(b);
        
        driver.findElement(TotalButton).click();
    }
}