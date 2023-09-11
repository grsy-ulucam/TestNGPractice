package testies.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import testies.utiles.BaseTest;

public class Task08 extends BaseTest {
    /*
    Test Case1: Positive Login Test
Open page https://practicetestautomation.com/practice-test-login/
Type username student into Username field
Type password Password123 into Password field
Puch Submit button.
Verify new page URL contains practicetestautomation.com/logged-in-successfully/
Verify new page contains expected text ('Congratulations' or 'successfully logged in')
Verify button Log out is displayed on the new page
     */

    @Test
    public void assertTesting() {

        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
        username.sendKeys("student");
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("Password123");
        WebElement submitButton = driver.findElement(By.xpath("//*[@id='submit']"));
        submitButton.click();
        WebElement loggedMesaj = driver.findElement(By.xpath("//*[@id='loop-container']/div/article/div[2]/p[1]/strong"));
        String text = loggedMesaj.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Congratulations student. You successfully logged in!");
        WebElement logButton = driver.findElement(By.xpath("//*[@id='loop-container']/div/article/div[2]/div/div/div/a"));
        Assert.assertTrue(logButton.isDisplayed());

    }

    /*
    Test Case2: Negative Username Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username incorrectUser into Username field.
    Type password Password123 into Password field.
    Puch Submit button.
    Verify error message is displayed.
    Verify error message text is Your username is invalid!
     */
    @Test
    public void softAssertTesting() {

        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
        username.sendKeys("incorrectUser");
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("Password123");
        WebElement submitButton = driver.findElement(By.xpath("//*[@id='submit']"));
        submitButton.click();
        WebElement errorMesaj = driver.findElement(By.xpath("//*[@id='error']"));
        String text = errorMesaj.getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(errorMesaj.isDisplayed());
        softAssert.assertAll(String.valueOf(text.contains("Your username is invalid!")));

    }

    @Override
    public void tearDown() {
        driver.quit();
    }
}
