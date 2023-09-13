package testies.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import testies.utiles.BaseTestReport;

public class Task20 extends BaseTestReport {

@Test
    public  void test01(){

    extentTest = extentReports.createTest("Test01","google main page");
    extentTest.info("Test start");
    driver.get("https://www.google.com/");
    driver.findElement(By.id("APjFqb")).sendKeys("pen"+ Keys.ENTER);
    extentTest.info("assert will done");
    Assert.assertTrue(driver.findElement(By.id("result-stats")).isDisplayed());
    extentTest.pass("verify is done");

}
}
