package com.tr.manager;

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
    
    public void fillTeamCreationForm(String teamName, String teamDescription) {
        typeNameTeam(teamName);
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
