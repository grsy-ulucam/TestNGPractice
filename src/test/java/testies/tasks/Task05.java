package testies.tasks;

import org.testng.annotations.Test;

public class Task05 {

    @Test(
            timeOut = 1000L
    )
    public void Test01()
    {
        System.out.println("Test01 runs before 1 sn");
    }
    @Test(
            timeOut =  2000L
    )
    public void Test02() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Test02 runs before 1 sn");
    }
}
