package com.cybertek.test.day3_locating_webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3_Amazon_cssSelector {

    public static void main(String[] args) {

        // TC #3: Amazon link number verification
        // 1. Open Chrome browser
        // 2. Go to https://www.amazon.com
        // 3. Enter search term (use css Selector to locate search box)
        // 4. Verify title contains search term*

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");

        //3 Enter search term (use cssSelector to locate search box)
        // Locating a web element using the first syntax in cssSelector
        WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));


        searchBox.sendKeys("wooden spoon" + Keys.ENTER);
        //4. Verify title contains search term


    }
}
