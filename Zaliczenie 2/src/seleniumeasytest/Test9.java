package seleniumeasytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test9{
    WebDriver driver;
    
    By ButtonShow1 = By.xpath("//button[@class='btn btn-primary']");
    By ButtonShow2 = By.xpath("//button[@class='btn btn-success']");
    By ButtonShow3 = By.xpath("//button[@class='btn btn-warning']");
    
    public Test9(WebDriver driver){
        this.driver = driver;
    }
    
    public void firstDialog(){
        driver.findElement(ButtonShow1).click();
    }
    
    public void secondDialog(){
        driver.findElement(ButtonShow2).click();
    }
    
    public void thirdDialog(){
        driver.findElement(ButtonShow3).click();
    }
}