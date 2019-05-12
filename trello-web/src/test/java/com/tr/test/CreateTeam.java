package com.tr.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTeam extends TestBase {
    
    @Test
    public void teamCreationFromHeaderTest() throws InterruptedException {
        
        String teamNameBefore = "Test Team Expected";
        String teamDescreeption = "Team Description";
        
        app.clickOnPlusButtonOnHeader();
        app.selectCreateTeamFromDropDown();
        
        app.fillTeamCreationForm(teamNameBefore, teamDescreeption);
        app.submitTeamCreation();
        
        //===================================
        String teamNameActual = app.getTeamName();
    
        Assert.assertEquals(teamNameActual, teamNameBefore);
        
    }
}
