package com.tr.test;

import org.testng.annotations.Test;

public class CreateBoard extends  TestBase{
    
    @Test
    public void boardCreationTest() throws InterruptedException {
    
        String boardName = "Test Board";
        app.clickOnPlusButtonOnHeader();
        app.selectCreationBoardFromDropDown();
        app.fillBoardCreationForm(boardName);
        app.submitBoardCreation();
    }
    
    @Test(enabled = false)
    public void boardCreationNegativeTest(){
    
    }
    
}
