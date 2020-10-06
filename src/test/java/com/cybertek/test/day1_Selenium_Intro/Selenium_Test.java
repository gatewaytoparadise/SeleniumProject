package com.cybertek.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
class SeleniumTest {
    public static void main(String[] args) {
// 1 set up the web driver
        WebDriverManager.chromedriver().setup();
// 2 create the instance oof the chrome driver
        WebDriver driver = new ChromeDriver();
        // test if the driver is working
        driver.get("https://www.google.com");









    }
}

