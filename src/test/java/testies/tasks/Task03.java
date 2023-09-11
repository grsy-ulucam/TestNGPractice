package testies.tasks;

import org.testng.annotations.Test;

public class Task03 {

    @Test
    public void loginTest() {
        System.out.println("login test is done ");
    }

    @Test
    public void registrationTest() {
        System.out.println("registration test is done ");
    }

    @Test(
            dependsOnMethods = {"loginTest", "registrationTest"})
    public void homePageTest() {
        System.out.println("Home Page test is done ");
    }
}
