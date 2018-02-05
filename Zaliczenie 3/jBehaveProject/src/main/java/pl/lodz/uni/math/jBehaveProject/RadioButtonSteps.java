package pl.lodz.uni.math.jBehaveProject;

import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonSteps extends Steps{
	
	WebDriver driver;
	
	@BeforeScenario
	public void setUp(){
        String exePath = "C:\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
    }
	
	@Given("open chrome radiobutton")
	public void openChrome()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@When("go to the website $site3")
	public void goWebSite(String site3)
	{
		driver.get(site3);	
	}
	
	@Then("select the male radiobutton")
	public void maleRadioButton()
	{
		By maleButton = By.xpath("//input[@value='Male'][@name='optradio']");
		driver.findElement(maleButton).click();
	}
	
	@When("click on check button")
	public void buttonCheck() throws InterruptedException
	{
		By checkButton = By.xpath("//button[@id='buttoncheck']");
		driver.findElement(checkButton).click();
		Thread.sleep(2000);
	}
	
	@Then("should be written $result4")
	public void isCorrectMessage(String result4)
	{
		Assert.assertTrue(driver.getPageSource().contains(result4));	
	}
	
	@Then("close chrome radiobutton")
	public void closeChrome()
	{
		driver.quit();
	}
}
