package com.shield.helpers;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Start" + context.getName());
    }

    public void onFinish(ITestContext context) {
        System.out.println("Finish " + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Start " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Success " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failure " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }
}
