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

public class SelectDropDownSteps extends Steps{
	
	WebDriver driver;
	
	@BeforeScenario
	public void setUp(){
        String exePath = "C:\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
    }
	
	@Given("open chrome selectdropdown")
	public void openChrome()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@When("go to the website $site4")
	public void goWebSite(String site4)
	{
		driver.get(site4);
	}
	
	@Then("expand the list")
	public void expendList()
	{
		By selectList = By.xpath("//select[@id='select-demo']");
		driver.findElement(selectList).click();
	}
	
	@When("select on the value Friday")
	public void selectValue() throws InterruptedException
	{
		By selectFriday = By.xpath("//option[@value='Friday']");
		driver.findElement(selectFriday).click();
		Thread.sleep(2000);
	}
	
	@Then("should be written $result5")
	public void isCorrectMessage(String result5)
	{
		Assert.assertTrue(driver.getPageSource().contains(result5));
	}
	
	@Then("close chrome selectdropdown")
	public void closeChrome()
	{
		driver.quit();
	}
}
