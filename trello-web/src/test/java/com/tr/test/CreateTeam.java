package com.tr.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTeam extends TestBase {
    
    @Test
    public void teamCreationFromHeaderTest() throws InterruptedException {
        
        String teamNameExpected = "Test Team Expected" + System.currentTimeMillis();
        String teamDescreeption = "Team Description" + System.currentTimeMillis();
        
        app.getHeaderHelper().clickOnPlusButtonOnHeader();
        app.getTeamHelper().selectCreateTeamFromDropDown();
        
        app.getTeamHelper().fillTeamCreationForm(teamNameExpected, teamDescreeption);
        app.getTeamHelper().submitTeamCreation();
        
        //===================================
        String teamNameActual = app.getTeamHelper().getTeamName();
        Assert.assertEquals(teamNameActual, teamNameExpected);
        
    }
}
