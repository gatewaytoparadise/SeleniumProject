package com.cybertek.test.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationsAndTitleVerification {

    public static void main(String[] args) {
        // TASKS: Back and Forth Navigation
        // Open Chrome Browser
        WebDriverManager.chromedriver().setup();

        //open browser
        WebDriver driver = new ChromeDriver();

        //2 Go to https://www.google.com
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        //3 Click to Gmail from top right of the page
        driver.findElement(By.linkText("Gmail")).click();

        //4 Verify title contains
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(expectedInTitle.contains(actualTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }
    }
}
