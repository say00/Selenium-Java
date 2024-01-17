package TestNGTutorial;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements TestNG listeners
public class Listeners implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("I successfully executed Listeners Pass code.");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("I failed executed Listeners Pass code. Failed on test class: " + result.getName());
    }
}
