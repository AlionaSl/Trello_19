package com.tr.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTeam extends TestBase {
    
    @Test
    public void teamCreationFromHeaderTest() throws InterruptedException {
        
        app.clickOnPlusButtonOnHeader();
        app.selectCreateTeamFromDropDown();
        app.fillTeamCreationForm("Test Team Expected", "Team Description");
        app.submitTeamCreation();
        
        //===================================
        String teamNameActual = app.getTeamName();
    
        Assert.assertEquals(teamNameActual, "Test Team Expected");
        
    }
}
