package com.qatest.qatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class MainPageTest {
    private WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://subscribe.jawwy.tv/ae-en?");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void validate() {


        // validate Plans

        String prem = String.valueOf(driver.findElement(By.xpath("//*[@id='name-lite']")).isDisplayed());
        System.out.println("Validate the Lite Plan = " + prem);

        String classic = String.valueOf(driver.findElement(By.xpath("//*[@id='name-classic']")).isDisplayed());
        System.out.println("Validate the Classic Plan = " + classic);

        String premium = String.valueOf(driver.findElement(By.xpath("//*[@id='name-premium']")).isDisplayed());
        System.out.println("Validate the Premium Plan = " + premium);

        // validate Country

        boolean contry = driver.findElement(By.cssSelector("span[id='ae-contry-lable']")).isEnabled();
        System.out.println("Validate the Country UAE = " + contry);

        // validate currency

        String price = String.valueOf(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div[3]/div[2]/div[1]/div/b")).isDisplayed());
        System.out.println("Validate the Price 5.4 = " + price);


    }
}