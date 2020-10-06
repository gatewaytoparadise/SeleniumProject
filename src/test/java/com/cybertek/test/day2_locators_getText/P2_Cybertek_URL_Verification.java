package com.cybertek.test.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_Cybertek_URL_Verification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.practice.cybertekschool.com");

        String expectedTitle = "Cybertek";
        String actualTitle = driver.getTitle();

        if (driver.getTitle().equals("Practice")) {
            System.out.println("Title verification PASSSED!");
        } else {
            System.out.println("Title verification FAILED!!");
        }driver.close();

    }
}
