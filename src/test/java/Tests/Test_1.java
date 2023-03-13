package Tests;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

import static Main.TestNg.driver;

public class Test_1 {


    @Parameters({"StartUrlLogin"})
    @Test(groups = {"test1"}, testName = "Log in")
    public void mainCode(String StartUrlLogin) throws InterruptedException, IOException {

        System.out.println("*** 'for' + print all links ***");

        // Переход на начальную страницу
        driver.get(StartUrlLogin);
        Thread.sleep(3000);

        // Find the div element with class "logo-nav"
       List <WebElement> tags = driver.findElements(By.tagName("a"));
        System.out.println("total tags - " + tags.size());

        for (int i = 0; i<tags.size(); i++ ){
            System.out.println("Links on page are " + tags.get(i).getDomAttribute("href"));
            System.out.println("Links on page are " + tags.get(i).getText());

//            for (WebElement tag : tags) {
//                System.out.println("Links on page are " + tag.getDomAttribute("href"));
//                System.out.println("Links on page are " + tag.getText());

        }



    }

}


