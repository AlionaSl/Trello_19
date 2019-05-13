package com.tr.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HelperBase {
    
    WebDriver wd;
    
    public HelperBase(WebDriver wd) {
        
        this.wd = wd;
    }
    
    public void click(By locator) {
        wd.findElement(locator).click();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    
    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
}
