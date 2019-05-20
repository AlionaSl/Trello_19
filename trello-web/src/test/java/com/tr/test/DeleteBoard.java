//package com.tr.test;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class DeleteBoard extends TestBase {
//
//    WebDriver wd;
//  //span[@class="icon-lg icon-member"]/../../..//ul // !!!!!!!!!!!!!
//    @Test
//    public void deleteBoard (){
//
//        cllickOnHomePageIcon();
//        chooseBoardNeedDelete(); // how to choose?
//        clickOnShowMenuInBoardHeader(); // if it exists
//        clickOnMore();
//        clickOnCloseBoard();
//        clickOnButtonClose();
//        // or
//        clickOnIconCloseCross(); //class="pop-over-header-close-btn icon-sm icon-close"
//        clickOnPermanentlyDeleteBoard();
//        // or
//        clickOnRe-open();
//
//    }
//
//        public void boardClose() {
//
//        clickOnShowMenuInBoardHeader();
//        click(By.cssSelector("[class='board-menu-navigation-item-link js-close-board']"));
//        click(By.cssSelector("[class='js-confirm full negate']"));
//    }
//
//    public void clickOnShowMenuInBoardHeader() {
////        click(By.cssSelector(".board-header-btns mod-right"));
//        click(By.cssSelector("[class='board-menu-navigation-item-link js-open-more']"));
//        wd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//    }
//
//    public void clickOnFirstPersonalBoardOnHomePage() {
//        click(By.cssSelector("[class='board-tile']"));
//    }
//
//    public void click(By locator) {
//        wd.findElement(locator).click();
//        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    }
//
//    public void type(By locator, String text) {
//        click(locator);
//        wd.findElement(locator).clear();
//        wd.findElement(locator).sendKeys(text);
//    }
//
//
//}
