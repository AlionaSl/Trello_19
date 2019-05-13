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
    
    public String getBoardName() {
//        return wd.findElement(By.cssSelector("[class='js-board-editing-target board-header-btn-text']")).getText();
//        String boardName = wd.findElement(By.cssSelector("[class='board-name-input js-board-name-input']")).getText();
        String boardName = wd.findElement(By.cssSelector("[class='js-board-editing-target board-header-btn-text']")).getText();
        wd.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        return boardName;
    }
    
    public int getBoardsCount() {
        wd.findElements(By.cssSelector("")).size();
        return 0;
    }
    
 
}
