package testies.tasks;

import org.testng.annotations.Test;

public class Task09 {
    @Test(
            groups = {"smoke", "regression"}
    )
    public void loginTest() {
    }

    @Test(
            groups = {"regression"}
    )
    public void aboutTest() {
    }

    @Test(
            groups = {"regression"}
    )
    public void contactTest() {
    }

    @Test(
            groups = {"regression", "smoke"}
    )
    public void registrationTest() {
    }

    @Test(
            groups = {"regression", "smoke"}
    )
    public void checkoutTest() {
    }
}
