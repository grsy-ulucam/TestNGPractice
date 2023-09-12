package testies.tasks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task15 {
    public Task15() {
    }

    @Test(
            dataProvider = "getData"
    )
    public void test(String name, String surname) {
        System.out.println(name + " " + surname + " " + Thread.currentThread().getId());
    }

    @DataProvider(
            parallel = true
    )
    public Object[][] getData() {
        return new Object[][]{{"yusuf", "celik"}, {"can", "efe"}, {"merve", "aslan"}};
    }
}
