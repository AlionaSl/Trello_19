package com.tr.test;

import org.testng.annotations.Test;

public class CreateBoard extends  TestBase {
    
    @Test
    public void boardCreationTest() throws InterruptedException {
    
        // int before = app.getBoardHelper().getBoardsCount();
//        System.out.println(before);
    
        String nameBoardBefore = "Test Board" + System.currentTimeMillis();
    
        app.getHeaderHelper().clickOnPlusButtonOnHeader();
        app.getBoardHelper().selectCreationBoardFromDropDown();
        app.getBoardHelper().fillBoardCreationForm(nameBoardBefore);
        app.getBoardHelper().submitBoardCreation();

//        cllickOnHomePageIcon();
    
    }
        @Test(enabled = false)
        public void boardCreationNegativeTest () {
        
    
    }
}
