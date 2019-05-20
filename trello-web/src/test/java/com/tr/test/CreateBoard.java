package com.tr.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateBoard extends  TestBase {
    
    @Test
    public void boardCreationTest() throws InterruptedException {
    
//        int boardsBefore = app.getBoardHelper().getBoardsCount();
//        System.out.println(boardsBefore);
    
        String nameBoardExpected = "Test Board" + System.currentTimeMillis();
    
        app.getHeaderHelper().clickOnPlusButtonOnHeader();
        app.getBoardHelper().selectCreationBoardFromDropDown();
        app.getBoardHelper().fillBoardCreationForm(nameBoardExpected);
        app.getBoardHelper().submitBoardCreation();
        
//        String nameBoardActual = app.getBoardHelper().getBoardName();
//        Assert.assertEquals(nameBoardActual, nameBoardExpected);

        // return to home page
        app.getHeaderHelper().clickOnHomeIconOnHeader();
        
//        int boardsAfter = app.getBoardHelper().getBoardsCount();
//        Assert.assertEquals(boardsAfter,boardsBefore+1);
    
    }
        @Test(enabled = false)
        public void boardCreationNegativeTest () {
        
    
    }
}
