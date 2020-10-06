package com.cybertek.test.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_Google_Search {

    public static void main(String[] args) {
        // TASKS: Back and Forth Navigation
        // 1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();

        //open browser
        WebDriver driver = new ChromeDriver();

        // 2. Go to https://www.google.com
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        // 3. Write "Apple" in search box
        // to be able to write anything in the search box
        // I need to locate the search box and use sendKeys() method to send "apple"

        // <----- finding the search box  || sending the keys.
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

        // 4 Click google search bottom
        // 5 Verify title
        // 6 Expected: Title should start with "apple"

        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Search title verification PASSED!");
        }else{
            System.out.println("Search title verification FAILED!");
        }


    }
}
