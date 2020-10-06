package com.cybertek.test.day4_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class VYtrack {

    public static class LoginFunction {
        public static void main(String[] args) throws InterruptedException, IOException {
            String URL = "https://qa2.vytrack.com/user/login";
            String userName = "user178";
            String password = "UserUser123";
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(URL);
            System.out.println("The title of the page is: " + driver.getTitle());
            String actualTitle = driver.getTitle();
            System.out.println("ACTUAL TITLE STRING: " + actualTitle);
            String actualUrl = driver.getCurrentUrl();
            System.out.println("actualUrl =" + actualUrl);
            Thread.sleep(3000);
            driver.findElement(By.id("prependedInput")).sendKeys(userName);
            driver.findElement(By.id("prependedInput2")).sendKeys(password);
            driver.findElement(By.id("_submit")).click();
            String expected = "Dashboard";
            String actual = driver.getTitle();
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
            System.out.println(expected.equals(actual)?"Pass:":"Fail");
        }
    }
}