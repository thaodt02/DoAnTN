package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DangNhap {
    ChromeDriver chromeDriver;

    @BeforeMethod
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
        chromeDriver = new ChromeDriver(options);
        System.out.println("Setup");
    }

    @Test
    public void TC01(){
        System.out.println("Hello");
        chromeDriver.get("http://localhost:3000/");
        sleep(10000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "admin@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
    }

    @Test
    public void TC02(){
        System.out.println("Hello");
        chromeDriver.get("http://localhost:3000/");
        sleep(10000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
    }

    @AfterMethod
    public void Cleanup(){
        chromeDriver.quit();
        System.out.println("bye");
    }

    private void sleep(int time){
        try{
            Thread.sleep(time);
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
    }
}
