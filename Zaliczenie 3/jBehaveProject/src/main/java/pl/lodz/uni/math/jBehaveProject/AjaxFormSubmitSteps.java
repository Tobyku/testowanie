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

public class AjaxFormSubmitSteps extends Steps{
	
	WebDriver driver;
	
	@BeforeScenario
	public void setUp(){
        String exePath = "C:\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
    }
	
	@Given("open chrome ajaxformsubmit")
	public void openChrome()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@When("go to the website $site5")
	public void goWebSite(String site5)
	{
		driver.get(site5);
	}

	@Then("click on the name textbox")
	public void clickOnNameTextBox()
	{
		By nameTextBox = By.xpath("//input[@id='title']");
		driver.findElement(nameTextBox).click();
	}
	
	@Then("type the name $input2")
	public void typeName(String input2)
	{
		By nameTextBox = By.xpath("//input[@id='title']");
		driver.findElement(nameTextBox).sendKeys(input2);
	}
	
	@Then("click on the comment textbox")
	public void clickOnCommentTextBox()
	{
		By commentTextBox = By.id("description");
        driver.findElement(commentTextBox).click();
	}
	
	@Then("type the comment $input3")
	public void typeComment(String input3)
	{
		By commentTextBox = By.id("description");
		driver.findElement(commentTextBox).sendKeys(input3);
	}
	
	@When("press the submit button")
	public void clickSubmitButton() throws InterruptedException
	{
		By submitButton = By.id("btn-submit");
		driver.findElement(submitButton).click();
		Thread.sleep(2000);
	}
	
	@Then("should be written $result6")
	public void isCorrectMessage(String result6) throws InterruptedException
	{
		Assert.assertTrue(driver.getPageSource().contains(result6));
		Thread.sleep(2000);
	}
	
	@Then("close chrome ajaxformsubmit")
	public void closeChrome()
	{
		driver.quit();
	}
}
