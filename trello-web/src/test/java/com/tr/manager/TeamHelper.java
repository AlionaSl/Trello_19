package com.tr.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TeamHelper extends HelperBase {
    
    WebDriver wd;
    
    public TeamHelper(WebDriver wd) {
    
        this.wd = wd;
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
    
    // ========================================
    public void click(By locator) {
        wd.findElement(locator).click();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
}
