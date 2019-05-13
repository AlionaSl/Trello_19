package com.tr.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BoardHelper extends HelperBase {
 
    public BoardHelper(WebDriver wd) {
        super(wd);
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
    
}
