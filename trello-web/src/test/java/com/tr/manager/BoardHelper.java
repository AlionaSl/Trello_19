package com.tr.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BoardHelper extends HelperBase {
    
    WebDriver wd;
    
    public BoardHelper(WebDriver wd) {
        this.wd = wd;
    }
    
    public void submitBoardCreation() {
        click(By.cssSelector("[type=submit]"));
    }
    
    public void fillBoardCreationForm(String boardName) {
        type(By.cssSelector("[placeholder='Add board title']"), boardName);
        // the alternative for the previous line:
//        type(By.cssSelector("//*[@class='subtle-input']"), boardName);
    }
    
    public void selectCreationBoardFromDropDown() {
        click(By.cssSelector(".js-new-board"));
    }
    
    // ========================================
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
