package testies.tasks;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Task01 {

    @Test
    void test01() {
        System.out.println("test01 runs");
    }

    @BeforeSuite
    void beforeSuit() {
        System.out.println("Before suit runs");
    }

    @AfterSuite
    void afterSuit() {
        System.out.println("After suit runs");
    }


}
