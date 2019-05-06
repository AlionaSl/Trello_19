package com.tr.test;

import org.testng.annotations.Test;

public class CreateBoard extends  TestBase{
    
    @Test
    public void boardCreationTest() throws InterruptedException {
    
        app.clickOnPlusButtonOnHeader();
        app.selectCreationBoardFromDropDown();
        app.fillBoardCreationForm("Test Board");
        app.submitBoardCreation();
    }
    
    @Test(enabled = false)
    public void boardCreationNegativeTest(){
    
    }
    
}
