package testies.utiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {

    protected WebDriver driver;

    protected Actions actions;

    @BeforeMethod
    public void setup() {

        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        actions = new Actions(driver);
    }

    @AfterMethod
    public void teardown() {

        driver.quit();
    }

    public abstract void tearDown();
}
