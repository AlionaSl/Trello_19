package com.tr.manager;

import com.tr.model.Team;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TeamHelper extends HelperBase {
    
    public TeamHelper(WebDriver wd) {
        super(wd);
    }
    
    public void selectCreateTeamFromDropDown() {
        
        click(By.cssSelector(".js-new-org"));
    }
    
    public void fillTeamCreationForm(Team team) {
//        typeNameTeam(teamName);
//        typeDescriptionTeam(teamDescription);
        // changed 23.05.19
        typeNameTeam(getTeamName());
        typeDescriptionTeam(teamDescription);
    }
    
    private void typeDescriptionTeam(String teamDescription) {
        type(By.cssSelector("#org-desc"), teamDescription);
    }
    
    private void typeNameTeam(String teamName) {
        type(By.cssSelector("#org-display-name"), teamName);
    }
    
    public String getTeamName(){
        return wd.findElement(By.cssSelector("h1.u-inline")).getText();
    }
    
    public void submitTeamCreation() {
        click(By.cssSelector("[type='submit']"));
    }
    
}
