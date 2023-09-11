package testies.tasks;

import org.testng.annotations.Test;

public class Task04 {

    @Test(enabled = false)
    public  void test01(){

        System.out.println("test01 is disable test");

    }
    @Test(enabled = true)
    public  void test02(){

        System.out.println("test02 is enable test");

    }




}
