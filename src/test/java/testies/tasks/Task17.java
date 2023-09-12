package testies.tasks;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Task16.class)
public class Task17 {
    public Task17() {
    }
    @Test
    public void passedTest() {
        System.out.println("passed test");
    }

    @Test
    public void failedTest() {
        System.out.println("failed test");
        Assert.fail();
    }

    @Test(
            timeOut = 500L
    )
    public void timedOutTest() throws InterruptedException {
        System.out.println("Timed out test");
        Thread.sleep(600L);
    }



}
