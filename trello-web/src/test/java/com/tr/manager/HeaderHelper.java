package com.tr.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HeaderHelper extends HelperBase {
    
    public HeaderHelper(WebDriver wd) {
        super(wd);
    
    }
    
    public void clickOnPlusButtonOnHeader() throws InterruptedException {
        
        Thread.sleep(3000);
        
        click(By.cssSelector("[aria-label='Create Board or Organization']"));
    
        // the alternative for the previous lines:
//        click(By.xpath("//*a[@class='header-btn js-open-add-menu']"));
//        click(By.cssSelector("[class='header-btn-icon icon-lg icon-add light']"));
    }
    
 
//    public void clickOnHomeButtonOnHeader(){
//        click(By.cssSelector("[class='header-btn js-back-menu']"));
//    }
    
    public void clickOnHomeIconOnHeader() {
//        click(By.cssSelector(".icon-house"));
//        click(By.cssSelector("[class='header-btn-icon icon-lg icon-house light']");
        //[class='header-btn js-back-menu']
        //[aria-label='Back to Home']

//        click(By.cssSelector("[aria-label='Back to Home']"));
        WebDriverWait wait = new WebDriverWait(wd, 10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='header-btn-icon icon-lg icon-house light']")));
//        click(By.cssSelector("[class='header-btn-icon icon-lg icon-house light']"));
    
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".header-back-button a.header-btn .icon-house")));
        click(By.cssSelector(".header-back-button a.header-btn"));
        // .header-back-button a.header-btn .icon-house
        
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[aria-label='Back to Home']")));
//        click(By.cssSelector("[aria-label='Back to Home']"));
    
    }
    
    
}
