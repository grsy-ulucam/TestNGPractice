package testies.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import testies.utiles.BaseCrossBrowserTest;

public class Task13 extends BaseCrossBrowserTest {

    public Task13() {
    }

    @Test
    public void crossBrowserTest() throws InterruptedException {
        this.driver.get("https://www.google.com/");
        Thread.sleep(3000L);
        Assert.assertEquals(this.driver.getTitle(), "Google");
    }
}
