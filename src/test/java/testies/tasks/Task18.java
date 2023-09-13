package testies.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testies.utiles.BaseTest;

public class Task18 extends BaseTest {
/*
Open the site: https://www.amazon.com/
Do it with DataProvider for
Java
JavaScript
Phyton
 */


    @Test(
            dataProvider = "getData"
    )
    public void amazon(String data) {
        driver.get("https://www.amazon.com/");
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(data+Keys.ENTER);
    }

    @DataProvider()
    public Object[][] getData() {
        return new Object[][]{
                {"Java"}, {"JavaScript"}, {"Phyton"}
        };
    }

    @Override
    public void tearDown() {
    }
}
