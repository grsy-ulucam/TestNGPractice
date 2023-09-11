package testies.tasks;

import org.testng.annotations.Test;

public class Task02 {

    @Test(priority = 0)
    public void test01() {
        System.out.println("Test01 runs");
    }

    @Test(priority = 1)
    public void test02() {
        System.out.println("Test01 runs");
    }

    @Test(priority = -1)
    public void test03() {
        System.out.println("Test01 runs");
    }

    @Test(priority = -15)
    public void test04() {
        System.out.println("Test01 runs");
    }


}
