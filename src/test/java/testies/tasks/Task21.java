package testies.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import testies.utiles.BaseTestReport;
import testies.utiles.ExcelUtils;

import java.time.Duration;

public class Task21 extends BaseTestReport {

    @Test
    public  void excelUtils(){

        // Go to URL: http://crossbrowsertesting.github.io/login-form.html
        //        //Login with credentials by using ExcelUtils
        //        //Username: tester@crossbrowsertesting.com
        //        //Password: test123

      String path="src/test/java/testies/resorcues/testdata.xlsx";

        ExcelUtils excelUtils=new ExcelUtils(path,2);

        driver.get("http://crossbrowsertesting.github.io/login-form.html");
        String email=excelUtils.getCellData(1,0);
        String password=excelUtils.getCellData(1,1);
        driver.findElement(By.id("username")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement welcome=driver.findElement(By.className("ng-binding"));
        wait.until(ExpectedConditions.visibilityOf(welcome));
        Assert.assertTrue(welcome.getText().contains(email));


    }
}
