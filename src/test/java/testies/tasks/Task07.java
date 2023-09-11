package testies.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task07 {
    @Test
    public  void hardAssertion() {

        System.out.println("Before hard assertion");
        Assert.assertEquals(1,2);
        System.out.println("After hard assertion");

    }

    @Test
    public void softAssertion(){

        System.out.println("Before soft assertion ");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(1,2);
        softAssert.assertTrue(true);
        System.out.println("After sort assertion");
        softAssert.assertAll();

    }
}
