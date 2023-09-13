package testies.tasks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testies.utiles.BaseTestReport;
import testies.utiles.JSUtils;

public class Task22 extends BaseTestReport {

    @Test

    public  void  test() throws InterruptedException {

        JSUtils.driver = driver;

        driver.get("https://www.amazon.com/");

        JSUtils.scrollIntoViewJS( driver.findElement(By.xpath("//*[@id='nav-orders']/span[1]")));

        Thread.sleep(4000);

        JSUtils.scrollAllUpByJS();

        Thread.sleep(4000);

        JSUtils.flash( driver.findElement(By.id("twotabsearchtextbox")));

        Thread.sleep(4000);

    }
}
