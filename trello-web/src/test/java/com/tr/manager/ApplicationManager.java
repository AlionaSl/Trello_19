package com.tr.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    
    public WebDriver wd;
    
    //    creation here NEW == spend resources !!!
    TeamHelper teamHelper;
    BoardHelper boardHelper;
    HeaderHelper headerHelper;
    UserHelper user;
    
    private String browser;
    
    public ApplicationManager(String browser) {
        this.browser = browser;
    }
    
    public void start() {
        
        if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        } else if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.EDGE)){
            wd = new EdgeDriver();
        }

//        wd.manage().window().fullscreen();
        
        openSite("https://trello.com/");
        String userID = "testeraliona@gmail.com";
        String userPassword = "12345678";
        
        user = new UserHelper(wd);
        login(userID, userPassword);
        
        boardHelper = new BoardHelper(wd);
        teamHelper = new TeamHelper(wd);
        headerHelper = new HeaderHelper(wd);
    }
    
    
    public void stop() {
//        logOut(); // it doesn't work for CreateBoard !!!
        wd.quit();
    }
    
    // getters for all the Helpers
    public BoardHelper getBoardHelper() {
        return boardHelper;
    }
    
    public TeamHelper getTeamHelper() {
        return teamHelper;
    }
    
    public HeaderHelper getHeaderHelper() {
        return headerHelper;
    }
    
    public UserHelper getUser() {
        return user;
    }
    // ======================================
    public void openSite(String url) {
        wd.get(url);
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    public void login(String userID, String userPassword) {
        clickOnLoginButton();
        type(By.cssSelector("#user"), userID);
        type(By.cssSelector("#password"), userPassword);
        click(By.cssSelector("#login"));
    }
    
    private void logOut() {
        click(By.cssSelector("[aria-label='Open Member Menu']"));
        
        // the alternative for the previous line:
//        click(By.cssSelector("[class='member']"));
//        click(By.xpath("//a[@class='header-btn header-avatar js-open-header-member-menu']"));
        
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        click(By.cssSelector(".js-logout"));
    }
    
    public void clickOnLoginButton() {
        
        click(By.cssSelector("[href='/login']"));
    }
    
    public void click(By locator) {
        wd.findElement(locator).click();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
    
}
