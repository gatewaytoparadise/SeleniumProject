package com.cybertek.test.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVerification {

    public static void main(String[] args) {

        // Task #1 Google Title Certification
        // 1. Open Chrome Browser
        // set up browser driver
        WebDriverManager.chromedriver().setup();
        //if you are using browser drivers locally, you
        // need to use System.setProperty EVERYTIME
        // we use WebDriverManager

        // open a chrome browser
        WebDriver driver = new ChromeDriver();

        // 2. Go to https://www.google.com
        driver.get("https://www.google.com");

        //3. Verify title
        // Expected: Google

        String expectedTitle = "Google";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSSED!");
        }else{
            System.out.println("Title verification FAILED!!");
        }





    }
}
