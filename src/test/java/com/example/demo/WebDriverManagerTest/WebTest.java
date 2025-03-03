package com.example.demo.WebDriverManagerTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {
    ChromeDriver chromeDriver;
    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
    }
    @Test
    public void dangKi(){
        chromeDriver.get("https://www.zoho.com/");
        WebElement btnSignUp = chromeDriver.findElement(By.xpath("//a[normalize-space()='Sign Up']"));
        btnSignUp.click();

        WebElement email = chromeDriver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("hoangnamkhanh08122005@gmail.com");

        WebElement pass = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("Khanh@2005");

        WebElement checkBox = chromeDriver.findElement(By.xpath("//*[@id=\"signup-termservice\"]"));
        checkBox.click();

        WebElement btn = chromeDriver.findElement(By.xpath("//input[@id='signupbtn']"));
        btn.click();
    }
    @Test
    public void dangNhap() throws InterruptedException{
        chromeDriver.get("https://www.zoho.com/");
        WebElement btnSignIn = chromeDriver.findElement(By.xpath("//a[@class='zgh-login'][normalize-space()='Sign In']"));
        btnSignIn.click();

        WebElement email = chromeDriver.findElement(By.xpath("//input[@id='login_id']"));
        email.sendKeys("hoangnamkhanh08122005@gmail.com");

        Thread.sleep(3000);

        WebElement pass = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("Khanh@2005");

        WebElement btn = chromeDriver.findElement(By.xpath("//button[@id='nextbtn']"));
        btn.click();
    }
    @AfterEach
    public void tearDown() throws InterruptedException{
        if (chromeDriver!=null){
            Thread.sleep(6000);
            chromeDriver.quit();
        }
    }
}
