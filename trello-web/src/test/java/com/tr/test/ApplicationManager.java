package com.tr.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    
    public void start() {
        // open browser
        wd = new ChromeDriver();
//        wd = new FirefoxDriver();
        wd.manage().window().fullscreen();
        
        openSite("https://trello.com/");
        login("testeraliona@gmail.com", "12345678");
    }
    
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
    
    public void clickOnLoginButton() {
        click(By.cssSelector("[href='/login']"));
    }
    
    public void click(By locator) {
        wd.findElement(locator).click();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    
    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
    
    protected void submitBoardCreation() {
        click(By.cssSelector("[type=submit]"));
    }
    
    public void fillBoardCreationForm(String boardName) {
        type(By.cssSelector("[placeholder='Add board title']"), boardName);
//        type(By.cssSelector("//*[@class='subtle-input']"), boardName);
    }
    
    public void selectCreationBoardFromDropDown() {
        click(By.cssSelector(".js-new-board"));
    }
    
    public void clickOnPlusButtonOnHeader() throws InterruptedException {

        Thread.sleep(3000);
        click(By.cssSelector("[aria-label='Create Board or Organization']"));
//        click(By.xpath("//*a[@class='header-btn js-open-add-menu']"));
//        click(By.cssSelector("[class='header-btn-icon icon-lg icon-add light']"));
    }
    
    public void stop() {
        wd.quit();
    }
}
