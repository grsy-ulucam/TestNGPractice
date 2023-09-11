package testies.tasks;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Task11 {
    String driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browserName) {


        if (browserName.equals("chrome")) {

            driver = "chrome";

        } else if (browserName.equals("firefox")) {

            driver = "firefox";

        } else if (browserName.equals("opera")) {

            driver = "opera";

        }


        System.out.println("Driver objesi olusturuldu - " + driver);

    }

    @AfterMethod

    public void tearDown() {

        driver = "-";
        System.out.println("driver snlandirildi " + driver);

    }
    
    @Test
    public void test() {

        System.out.println("Test execution basladi");
        System.out.println("Testte kullanilan driver = " + driver);

    }

}
