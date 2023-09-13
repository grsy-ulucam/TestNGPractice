package testies.tasks;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testies.utiles.BaseTest;


public class Task19 extends BaseTest {

    /*
    Go to URL: https://opensource-demo.orangehrmlive.com/
Login with negative credentilas by Data Provider.
Then assert that ‘’Invalid credentials’’ is displayed
     */

    @Test(
            dataProvider = "getData"
    )
    public void orange(String username,String password) {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement mesaj= driver.findElement(By.xpath("//div[@id='app']//child::p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
        Assert.assertTrue(mesaj.isDisplayed());
    }

    @DataProvider()
    public Object[][] getData() {
        return new Object[][]{
                {"lion","lion1234"}, {"bigfamily","bigfamily123"}, {"crazy","crazy1234"}
        };
    }

    public void tearDown() {

    }
}
