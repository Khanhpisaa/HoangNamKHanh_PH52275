package com.example.demo.WebDriverManagerTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {
    ChromeDriver chromeDriver;
    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() throws InterruptedException{
        if (chromeDriver != null){
            Thread.sleep(6000);
            chromeDriver.quit();
        }
    }
}
