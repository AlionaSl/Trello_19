package com.tr.test;

import com.tr.manager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    
    protected ApplicationManager app = new ApplicationManager();
    
    @BeforeClass
    public void setUp(){
        app.start();
    }
    
    @AfterClass
    public void tearDown(){
        app.stop();
    }
    
    public  void waitForElement(long timeOut, By locator){
        WebDriverWait wait = new WebDriverWait(wd, timeOut);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    
    public  void waitForElementAndClick(long timeOut, By locator){
        waitForElement(timeOut, locator);
        click(locator);
    }
    
}
