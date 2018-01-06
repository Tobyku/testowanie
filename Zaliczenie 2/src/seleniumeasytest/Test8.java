package seleniumeasytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test8{
    WebDriver driver;
    
    By CatchModalButton = By.xpath("//div[@class='row'][2]/div[@class='col-md-4 text-left']/div[@class='panel panel-default']/div[@class='panel-body']/a[@class='btn btn-primary']");
    By CatchModalButton2 = By.xpath("//div[@class='row'][2]/div[@class='col-md-4 text-left']/div[@class='panel panel-default']/div[@class='panel-body']/div[@id='myModal']/div[@class='modal-dialog']/div[@class='modal-content']/div[@class='modal-body']/a[@class='btn btn-primary']");
    
    public Test8(WebDriver driver){
        this.driver = driver;
    }
    
    public void firstModal(){
        driver.findElement(CatchModalButton).click();
    }
    
    public void secondModal(){
        driver.findElement(CatchModalButton2).click();
    }
}