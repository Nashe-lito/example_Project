package com.shield.tests;

import com.shield.helpers.ConfProperties;
import org.testng.annotations.Test;

public class FirstTests extends BaseTest{

    @Test
    public void firstTest() {
        driver.get(ConfProperties.getProperty("url"));
    }
}
