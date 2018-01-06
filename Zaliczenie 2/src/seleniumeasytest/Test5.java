package seleniumeasytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test5{
    WebDriver driver;
    
    By TextBox1 = By.xpath("//input[@id='title']");
    By TextBox2 = By.id("description");
    By SubmitButton = By.id("btn-submit");
    
    public Test5(WebDriver driver){
        this.driver = driver;
    }
    
    public void typeName(String text){
        driver.findElement(TextBox1).click();
        driver.findElement(TextBox1).sendKeys(text);
    }
    
    public void typeComment(String text){
        driver.findElement(TextBox2).click();
        driver.findElement(TextBox2).sendKeys(text);
        driver.findElement(SubmitButton).click();
    }
}