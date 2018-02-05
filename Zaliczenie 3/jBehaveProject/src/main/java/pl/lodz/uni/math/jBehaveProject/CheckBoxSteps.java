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

public class CheckBoxSteps extends Steps{
	
	WebDriver driver;
	
	@BeforeScenario
	public void setUp(){
        String exePath = "C:\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
    }
	
	@Given("open chrome checkbox")
	public void openChrome()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@When("go to the website $site2")
	public void goWebSite(String site2)
	{
		driver.get(site2);	
	}
	
	@Then("click on the checkbox")
	public void clickCheckBox() throws InterruptedException
	{
		By checkBox1 = By.id("isAgeSelected");
		driver.findElement(checkBox1).click();
		Thread.sleep(2000);
	}
	@Then("we should see $result3")
	public void isCheckBoxChecked(String result3)
	{
		Assert.assertTrue(driver.getPageSource().contains(result3));
	}
	
	@Then("close chrome checkbox")
	public void closeChrome()
	{
		driver.quit();
	}
}
