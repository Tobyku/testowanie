/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumeasytest;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Tobiasz
 */
public class testMainTest {
     
        @Before
        public void setUp(){
            String exePath = "C:\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", exePath);
            
            //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        
        @Test
        public void testPage1() throws InterruptedException{
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
            Thread.sleep(1000);
            
            Test1 object = new Test1(driver);
            
            object.typeText("Selenium test");
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("Selenium test"));
            
            object.sum("2", "2");
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("4"));
            
            driver.quit();
        }
        
        @Test
        public void testPage2() throws InterruptedException{
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
            Thread.sleep(1000);
            
            Test2 object = new Test2(driver);

            object.checkBox();
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("Success - Check box is checked"));
            
            object.checkAll();
            Thread.sleep(2000);
            object.uncheckAll();
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("Check All"));

            driver.quit();
        }
        
        @Test
        public void testPage3() throws InterruptedException{
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
            Thread.sleep(1000);
            
            Test3 object = new Test3(driver);

            object.selectSex();
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("Radio button 'Male' is checked"));
            
            object.selectSexAge();
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("Sex : Female"));
            Assert.assertTrue(driver.getPageSource().contains("Age group: 15 - 50"));
            
            driver.quit();
        }
        
        @Test
        public void testPage4() throws InterruptedException{
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
            Thread.sleep(1000);
            
            Test4 object = new Test4(driver);

            object.selectDay();
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("Day selected :- Friday"));
            
            object.selectState();
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("First selected option is : Ohio"));
            
            driver.quit();
        }
        
        @Test
        public void testPage5() throws InterruptedException{
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
            Thread.sleep(1000);
            
            Test5 object = new Test5(driver);

            object.typeName("Name");
            Thread.sleep(2000);
            
            object.typeComment("Comment");
            Thread.sleep(3000);
            Assert.assertTrue(driver.getPageSource().contains("Form submited Successfully!"));
            
            driver.quit();
        }
        
        @Test
        public void testPage6() throws InterruptedException{
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.seleniumeasy.com/test/table-sort-search-demo.html");
            Thread.sleep(1000);
            
            Test6 object = new Test6(driver);

            object.typeText("System Architect");
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("T. Nixon"));
            object.searchByBtn();
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("S. Burks"));
            
            driver.quit();
        }
        
        @Test
        public void testPage7() throws InterruptedException{
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
            Thread.sleep(1000);
            
            Test7 object = new Test7(driver);

            object.firstButton();
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("I'm a normal success message."));
            
            object.secondButton();
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("I'm a normal warning message."));
            
            object.thirdButton();
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("I'm a normal danger message."));
            
            object.fourthButton();
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("I'm a normal info message."));
            
            driver.quit();
        }
        
        @Test
        public void testPage8() throws InterruptedException{
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
            Thread.sleep(1000);
            
            Test8 object = new Test8(driver);

            object.firstModal();
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("First Modal"));
            
            object.secondModal();
            Thread.sleep(2000);
            Assert.assertTrue(driver.getPageSource().contains("Modal 2"));
            
            driver.quit();
        }
        
        @Test
        public void testPage9() throws InterruptedException{
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.seleniumeasy.com/test/bootstrap-progress-bar-dialog-demo.html");
            Thread.sleep(1000);
            
            Test9 object = new Test9(driver);

            object.firstDialog();
            Assert.assertTrue(driver.getPageSource().contains("Loading"));
            Thread.sleep(2500);
            
            object.secondDialog();
            Assert.assertTrue(driver.getPageSource().contains("Custom message"));
            Thread.sleep(3500);
            
            object.thirdDialog();
            Assert.assertTrue(driver.getPageSource().contains("Hello Mr. Alert !"));
            Thread.sleep(5500);
            
            driver.quit();
        }
        
        @Test
        public void testPage10() throws InterruptedException{
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html");
            Thread.sleep(1000);
            
            Test10 object = new Test10(driver);

            object.addAll();
            Thread.sleep(2000);
            
            object.removeAll();
            Thread.sleep(2000);
            
            object.addName();
            Thread.sleep(2000);
            
            object.removeName();
            Thread.sleep(2000);
            
            driver.quit();
        }
}
