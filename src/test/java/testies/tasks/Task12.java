package testies.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task12 {
    WebDriver driver;

    public Task12() {
    }

    @BeforeMethod
    @Parameters({"browser"})
    public void setup(String browserValue) {
        switch (browserValue) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                this.driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                this.driver = new FirefoxDriver();
        }

        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
    }

    @AfterMethod
    public void teardown() {
        this.driver.quit();
    }

    @Test
    @Parameters({"aranacakKelime"})
    public void parametersTest(String kelime) throws InterruptedException {
        this.driver.get("https://www.amazon.com");
        WebElement searchText = this.driver.findElement(By.id("twotabsearchtextbox"));
        searchText.sendKeys(new CharSequence[]{kelime});
        Thread.sleep(5000L);
    }

}
