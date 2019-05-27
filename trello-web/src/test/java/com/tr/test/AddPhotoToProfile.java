package com.tr.test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class AddPhotoToProfile extends TestBase {
    
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if (!app.getBoardHelper().isOnTheHomePage()) {
            app.getHeader().clickOnHomeButtonOnHeader();
        }
    }
    
    @Test
    public void testAddPhoto() {
        
        app.getUser().clickOnAvatar();
        app.getUser().clickProfileFromDropDown();
        
        
        app.getUser().clickChangePhoto();
        
        // 23.05.19
        
        app.getUser().attachPicture(new File("src/test/resources/qa"));
    }
}
