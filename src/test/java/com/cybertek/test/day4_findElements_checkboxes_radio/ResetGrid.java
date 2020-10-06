package com.cybertek.test.day4_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResetGrid {

    public static void main(String[] args) throws InterruptedException {

        String URL = "https://app.vytrack.com/user/login";
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
        driver.findElement(By.id("prependedInput")).sendKeys(userName);
        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.id("_submit")).click();
        String expected = "Dashboard";
        String actual = driver.getTitle();
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
        System.out.println(expected.equals(actual)?"Pass:":"Fail");
        //Thread.sleep(2000);

        //click on Fleet tab
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span")).click();
        //Thread.sleep(2000);

        //Select "Vehicle Odometer" from drop box.
        driver.findElement(By.className("\"title title-level-2\"")).click();
        Thread.sleep(3000);
        System.out.println("The title of the page is: " + driver.getTitle());
        String URL1 = "https://app.vytrack.com/entity/Extend_Entity_VehiclesOdometer";
        driver.get(URL1);
        Thread.sleep(3000);
        System.out.println("actualUrl =" + URL1);
        Thread.sleep(3000);

        // Selects the gear icon on the screen
        driver.findElement(By.xpath("//*[@id=\"grid-custom-entity-grid-244516290\"]/div[2]/div[1]/div/div[3]/div[1]/div/div/a/i")).click();
        Thread.sleep(3000);

        // Selects ID checkbox
        driver.findElement(By.id("<input id=\"column-c93\" type=\"checkbox\" data-role=\"renderable\">")).click();
        Thread.sleep(3000);

        // Closes Grid Settings box
        driver.findElement(By.xpath("//*[@id=\"grid-custom-entity-grid-111487347\"]/div[2]/div[1]/div/div[3]/div[1]/div/div/div/span[2]")).click();
        Thread.sleep(3000);

       // Clicks on Reset Grid
        driver.findElement(By.xpath("//*[@id=\"grid-custom-entity-grid-2012913919\"]/div[2]/div[1]/div/div[3]/div[1]/div/a[3]/i")).click();
        Thread.sleep(3000);


    }
}
