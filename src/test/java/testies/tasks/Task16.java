package testies.tasks;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Task16 implements ITestListener {
    public Task16() {
    }
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart methodu calisti");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess methodu calisti");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure methodu calisti");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped methodu calisti");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage methodu calisti");
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("onTestFailedWithTimeout methodu calisti");
    }

    public void onStart(ITestContext context) {
        System.out.println("onStart methodu calisti");
    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish methodu calisti");
    }
}
