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

public class BasicFirstFormSteps extends Steps {
	
	WebDriver driver;
	
	@BeforeScenario
	public void setUp(){
        String exePath = "C:\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
    }
	
	@Given("open chrome basicfirstform")
	public void openChrome()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@When("go to the website $site1")
	public void goWebSite(String site1)
	{
		driver.get(site1);	
	}
	
	@Then("click on the TextBox")
	public void clickOnTextBox()
	{
		By textBox = By.xpath("//input[@id='user-message']");
		driver.findElement(textBox).click();
	}
	
	@Then("we should see $result1")
	public void isTextBoxChecked(String result1)
	{
		Assert.assertTrue(driver.getPageSource().contains(result1));
	}
	
	@Then("enter the message $input1")
	public void typeMessage(String input1)
	{
		By textBox = By.xpath("//input[@id='user-message']");
		driver.findElement(textBox).sendKeys(input1);
	}
	
	@When("click on show button")
	public void showMessage() throws InterruptedException
	{
		By showBtn = By.xpath("//button[@onclick='showInput();']");
		driver.findElement(showBtn).click();
		Thread.sleep(2000);
	}
	
	@Then("we should see $result2")
	public void isCorrectMessage(String result2)
	{
		Assert.assertTrue(driver.getPageSource().contains(result2));
	}
	
	@Then("close chrome basicfirstform")
	public void closeChrome()
	{
		driver.quit();
	}
}
