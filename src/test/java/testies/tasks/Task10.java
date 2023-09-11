package testies.tasks;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Task10 {

    public Task10() {
    }

    @Test
    @Parameters({"name"})
    public void test01(String name) {
        System.out.println("Hello " + name);
    }

    @Test
    @Parameters({"surname"})
    public void test02(String surname) {
        System.out.println("Hello " + surname);
    }


}
