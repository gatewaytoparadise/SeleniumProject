package com.cybertek.test.day3_locating_webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ResetGrid2 {
    public static void main(String[] args) {
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
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("prependedInput")).sendKeys(userName);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("_submit")).click();
        String expected = "Dashboard";
        String actual = driver.getTitle();
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
        System.out.println(expected.equals(actual)?"Pass:":"Fail");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String ParentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent Window Handle " + ParentWindowHandle);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        for(String childTab:driver.getWindowHandles())
        {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/a/span")).click();
        }
        //Select "Vehicle Odometer" from drop box.
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/div/div/ul/li[4]/a/span")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String URL1 = "https://qa2.vytrack.com/entity/Extend_Entity_VehiclesOdometer";
        driver.get(URL1);
        System.out.println("The title of the page is: " + driver.getTitle());
        String ParentWindowHandleGearIcon = driver.getWindowHandle();
        System.out.println("Parent Window Handle " + ParentWindowHandleGearIcon);
        // Selects the gear icon on the screen
        try{
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div/a")).click();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("");
        }

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        // Selects ID checkbox
        driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Closes Grid Settings box
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div/a")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Clicks on Reset Grid
        driver.findElement(By.xpath("//a[@title='Reset']")).click();

    }
}
