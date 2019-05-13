package com.tr.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
    
 
    public void clickOnHomeBittonOnHeader(){
        click(By.cssSelector("[class='header-btn js-back-menu']"));
    }
    
}
